package com.portfolio.MR.Controller;

import com.portfolio.MR.DTO.AcademicDTO;
import com.portfolio.MR.Model.AcademicModel;
import com.portfolio.MR.Service.AcademicService;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
@RequestMapping("/academic")
@CrossOrigin(origins= "http://localhost:4200/")
public class AcademicController {
    @Autowired
    AcademicService academicService;
      
    
    @GetMapping("/list")
    public ResponseEntity<List<AcademicModel>> list(){
        List<AcademicModel> list = academicService.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }
    @GetMapping("/detail/{id}")
    public ResponseEntity<AcademicModel> getById(@PathVariable("id")Long id){
        if(!academicService.existById(id)){
            return new ResponseEntity(new Message("No existe el ID"), HttpStatus.BAD_REQUEST);
        }
        
        AcademicModel educacion = academicService.getOne(id).get();
        return new ResponseEntity(educacion, HttpStatus.OK);
    }
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Long id){
        if(!academicService.existById(id)){
            return new ResponseEntity(new Message("No existe el ID"), HttpStatus.NOT_FOUND);
        }
        academicService.delete(id);
        return new ResponseEntity(new Message("Formación académica eliminada"), HttpStatus.OK);
    }
    
    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody AcademicDTO dtoaca){
        if(StringUtils.isBlank(dtoaca.getTitle())){
            return new ResponseEntity(new Message("El campo no puede estar vacio"), HttpStatus.BAD_REQUEST);
        }        
        
        AcademicModel aca = new AcademicModel(dtoaca.getTitle(),dtoaca.getiDate(),dtoaca.getfDate(),dtoaca.getInstitute());
        academicService.save(aca);
        return new ResponseEntity(new Message("Formación académica creada"), HttpStatus.OK);
                
    }
    
    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") Long id, @RequestBody AcademicDTO dtoaca){
        if(!academicService.existById(id)){
            return new ResponseEntity(new Message("No existe el ID"), HttpStatus.NOT_FOUND);
        }
   
        AcademicModel aca = academicService.getOne(id).get();

        aca.setTitle(dtoaca.getTitle());
        aca.setiDate(dtoaca.getiDate());
        aca.setInstitute(dtoaca.getInstitute());
        aca.setfDate(dtoaca.getfDate());
              
   
      
        academicService.save(aca);
        
        return new ResponseEntity(new Message("Educacion actualizada"), HttpStatus.OK);
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
}
