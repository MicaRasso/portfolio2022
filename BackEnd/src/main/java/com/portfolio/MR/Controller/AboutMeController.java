
package com.portfolio.MR.Controller;

import com.portfolio.MR.DTO.AboutMeDTO;
import com.portfolio.MR.Model.AboutMeModel;
import com.portfolio.MR.Service.AboutMeService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
            
    @GetMapping("/list")
    public List<AboutMeModel> getAboutMe(){
        return aboutMeService.list();
    }
    
    @GetMapping("/get/{id}")
    public Optional<AboutMeModel> getAboutMe1(@PathVariable Long id){
        return aboutMeService.getOne(id);
    }
    
    @PostMapping("/set")
    public AboutMeModel saveAboutMe(@RequestBody AboutMeModel aboutMe){
        return this.aboutMeService.save(aboutMe);
    }
    
    @PostMapping("/update/{id}")     
    public ResponseEntity<AboutMeModel> update(@PathVariable("id") Long id,@RequestBody AboutMeDTO dtoam){       

        AboutMeModel aboutme = aboutMeService.getOne(id).get();
        
        aboutme.setName(dtoam.getName());
        aboutme.setLastname(dtoam.getLastname());
        aboutme.setTitle(dtoam.getTitle());
        aboutme.setDescription(dtoam.getDescription());
        aboutme.setBirthday(dtoam.getBirthday());
        aboutme.setImg_banner(dtoam.getImg_banner());
        aboutme.setImg_profile(dtoam.getImg_profile());
              
        aboutMeService.save(aboutme);
        
        return new ResponseEntity(new Message("Perfil actualizado"), HttpStatus.OK);
    }
}
