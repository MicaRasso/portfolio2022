
package com.portfolio.MR.Controller;

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
        return this.experienceService.saveExperience(experience);
    }
    
    @DeleteMapping("/delete/{id}")
    public void deleteExperience(@PathVariable Long id){
        this.experienceService.deleteExperience(id);
    }   
    
    @GetMapping("/list")
    public ResponseEntity<List<ExperienceModel>> list(){
        List<ExperienceModel> list;
        list = experienceService.list();
        return new ResponseEntity(list,HttpStatus.OK);
    }
    
}
