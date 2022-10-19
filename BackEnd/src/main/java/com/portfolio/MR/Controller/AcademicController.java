package com.portfolio.MR.Controller;

import com.portfolio.MR.Model.AcademicModel;
import com.portfolio.MR.Service.AcademicService;
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
@RequestMapping("/academic")
@CrossOrigin(origins= "http://localhost:4200/")
public class AcademicController {
    @Autowired
    AcademicService academicService;
            
     @GetMapping("/list")
    public ResponseEntity<List<AcademicModel>> list(){
        List<AcademicModel> list;
        list = academicService.list();
        return new ResponseEntity(list,HttpStatus.OK);
    }
    
    @PostMapping("/set")
    public AcademicModel save(@RequestBody AcademicModel academic){
        return this.academicService.save(academic);
    }
    
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id){
        this.academicService.delete(id);
    }
}
