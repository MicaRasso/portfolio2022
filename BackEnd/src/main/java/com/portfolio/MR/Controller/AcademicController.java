package com.portfolio.MR.Controller;

import com.portfolio.MR.Model.AcademicModel;
import com.portfolio.MR.Service.AcademicService;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins= "http://localhost:4200/")
public class AcademicController {
    @Autowired
    AcademicService academicService;
            
    @GetMapping("/academic/get")
    public ArrayList<AcademicModel> getAcademic(){
        return academicService.getAcademic();
    }
    
    @PostMapping("/academic/set")
    public AcademicModel saveAcademic(@RequestBody AcademicModel academic){
        return this.academicService.saveAcademic(academic);
    }
    
    @DeleteMapping("/academic/delete/{id}")
    public void deleteAcademic(@PathVariable Long id){
        this.academicService.deleteAcademic(id);
    }
}
