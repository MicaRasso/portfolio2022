
package com.portfolio.MR.Controller;

import com.portfolio.MR.DTO.ExperienceDTO;
import com.portfolio.MR.Model.ExperienceModel;
import com.portfolio.MR.Service.ExperienceService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/experience")
@CrossOrigin(origins= "http://localhost:4200/")
public class ExperienceController {
    @Autowired
    ExperienceService experienceService;
            
    @GetMapping("/list")
    public ResponseEntity<List<ExperienceModel>> list(){
        List<ExperienceModel> list = experienceService.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }
    
    @GetMapping("/detail/{id}")
    public ResponseEntity<ExperienceModel> getById(@PathVariable("id") Long id){
        if(!experienceService.existsById(id))
            return new ResponseEntity(new Message("no existe"), HttpStatus.NOT_FOUND);
        ExperienceModel exp = experienceService.getOne(id).get();
        return new ResponseEntity(exp, HttpStatus.OK);
    }
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Long id) {
        if (!experienceService.existsById(id)) {
            return new ResponseEntity(new Message("No existe"), HttpStatus.NOT_FOUND);
        }
        experienceService.delete(id);
        return new ResponseEntity(new Message("Eliminado"), HttpStatus.OK);
    }

    
    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody ExperienceDTO dtoexp){      
        if(StringUtils.isBlank(dtoexp.getTitle()))
            return new ResponseEntity(new Message("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
            
        ExperienceModel exp = new ExperienceModel(dtoexp.getTitle(),dtoexp.getiDate(),dtoexp.getfDate(), dtoexp.getDescription(),dtoexp.getCompany());
        experienceService.save(exp);
        return new ResponseEntity(new Message("Experiencia creada"), HttpStatus.OK);
    }
    
    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") Long id, @RequestBody ExperienceDTO dtoexp){
        if(!experienceService.existsById(id))
            return new ResponseEntity(new Message("El ID no existe"), HttpStatus.BAD_REQUEST);
       
        ExperienceModel exp = experienceService.getOne(id).get();
        exp.setTitle(dtoexp.getTitle());
        exp.setiDate(dtoexp.getiDate());
        exp.setfDate(dtoexp.getfDate());
        exp.setDescription(dtoexp.getDescription());
        exp.setCompany(dtoexp.getCompany());
        experienceService.save(exp);
        return new ResponseEntity(new Message("Experiencia actualizada"), HttpStatus.OK);
             
    }
}
