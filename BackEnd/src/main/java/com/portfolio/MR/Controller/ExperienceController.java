
package com.portfolio.MR.Controller;

import com.portfolio.MR.DTO.ExperienceDTO;
import com.portfolio.MR.Model.ExperienceModel;
import com.portfolio.MR.Service.ExperienceService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/experience")
@CrossOrigin(origins= "http://localhost:4200/")
public class ExperienceController {
    @Autowired
    ExperienceService experienceService;
            
    @GetMapping("/get")
    public ArrayList<ExperienceModel> getExperience(){
        return experienceService.getExperience();
    }
    
    @PostMapping("/set")
    public ExperienceModel saveExperience(@RequestBody ExperienceModel experience){
        return this.experienceService.save(experience);
    }
    
    @DeleteMapping("/delete/{id}")
    public void deleteExperience(@PathVariable Long id){
        this.experienceService.delete(id);
    }   
    
    @GetMapping("/list")
    public ResponseEntity<List<ExperienceModel>> list(){
        List<ExperienceModel> list;
        list = experienceService.list();
        return new ResponseEntity(list,HttpStatus.OK);
    }
/* POR AHORA USO EL saveExperience    
    public void create (@RequestBody ExperienceDTO expDTO){
        if(expDTO.getTitle()!=null && expDTO.getiDate()!=null && expDTO.getDescription()!=null){
            ExperienceModel exp= new ExperienceModel(expDTO.getTitle(),expDTO.getiDate(),expDTO.getfDate(),expDTO.getDescription(),expDTO.getId_company()); 
            experienceService.save(exp);
        }
    }
*/            
            
    @PostMapping("/update/{id}")     
    public void update(@PathVariable("id") Long id,@RequestBody ExperienceDTO expDTO){
        if(experienceService.existById(id)){
            ExperienceModel exp= new ExperienceModel();
            if(expDTO.getTitle()!=null)
                exp.setTitle(expDTO.getTitle());
            if(expDTO.getDescription()!=null)
                exp.setDescription(expDTO.getDescription());
            if(expDTO.getiDate()!=null)
                exp.setiDate(expDTO.getiDate());
            if(expDTO.getfDate()!=null)
                exp.setfDate(expDTO.getfDate());
            if(expDTO.getId_company()!=null)
                exp.setId_company(expDTO.getId_company());
        }
    }
}
