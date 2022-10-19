
package com.portfolio.MR.Controller;

import com.portfolio.MR.Model.SkillsModel;
import com.portfolio.MR.Service.SkillsService;
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
@RequestMapping("/skills")
@CrossOrigin(origins= "http://localhost:4200/")
public class SkillsController {
    @Autowired
    SkillsService skillsService;
    
        @GetMapping("/list")
    public ResponseEntity<List<SkillsModel>> list(){
        List<SkillsModel> list;
        list = skillsService.list();
        return new ResponseEntity(list,HttpStatus.OK);
    }
    
    @PostMapping("/skills/set")
    public SkillsModel saveSkills(@RequestBody SkillsModel skills){
        return this.skillsService.save(skills);
    }
    
    @DeleteMapping("/skills/delete/{id}")
    public void deleteSkills(@PathVariable Long id){
        this.skillsService.delete(id);
    }
}
