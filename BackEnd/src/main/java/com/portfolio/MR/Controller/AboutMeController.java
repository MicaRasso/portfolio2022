
package com.portfolio.MR.Controller;

import com.portfolio.MR.Model.AboutMeModel;
import com.portfolio.MR.Service.AboutMeService;
import java.util.ArrayList;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aboutme")
@CrossOrigin(origins= "http://localhost:4200/")
public class AboutMeController {
    @Autowired
    AboutMeService aboutMeService;
            
    @GetMapping("/get")
    public ArrayList<AboutMeModel> getAboutMe(){
        return aboutMeService.getAboutMe();
    }
    
    @GetMapping("/get/{id}")
    public Optional<AboutMeModel> getAboutMe1(@PathVariable Long id){
        return aboutMeService.getAboutMe1(id);
    }
    
    @PostMapping("/set")
    public AboutMeModel saveAboutMe(@RequestBody AboutMeModel aboutMe){
        return this.aboutMeService.saveAboutMe(aboutMe);
    }
    
}
