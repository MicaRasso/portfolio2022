
package com.portfolio.MR.Controller;

import com.portfolio.MR.Model.AboutMeModel;
import com.portfolio.MR.Service.AboutMeService;
import java.util.List;
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
    public AboutMeModel update(@PathVariable("id") Long id,@RequestBody AboutMeModel aboutMe){
        //AboutMeModel about= new AboutMeModel();

/*
        if(aboutMe.getName()!=null)
            about.setName(aboutMe.getName());
        if(aboutMe.getLastname()!=null)
            about.setLastname(aboutMe.getLastname());
        if(aboutMe.getBirthday()!=null)
            about.setTitle(aboutMe.getTitle());
        if(aboutMe.getDescription()!=null)
            about.setDescription(aboutMe.getDescription());
        if(aboutMe.getBirthday()!=null)
            about.setBirthday(aboutMe.getBirthday());
        if(aboutMe.getImg_profile()!=null)
            about.setImg_profile(aboutMe.getImg_profile());
        if(aboutMe.getImg_banner()!=null)
            about.setImg_banner(aboutMe.getImg_banner());
        this.aboutMeService.save(about);
*/        
        
        if(aboutMe.getName()!=null && aboutMe.getLastname()!=null && aboutMe.getDescription()!=null && aboutMe.getBirthday()!=null && aboutMe.getImg_profile()!=null && aboutMe.getImg_banner()!=null){
            /*about.setName(aboutMe.getName());
            about.setLastname(aboutMe.getLastname());
            about.setTitle(aboutMe.getTitle());
            about.setDescription(aboutMe.getDescription());
            about.setBirthday(aboutMe.getBirthday());
            about.setImg_profile(aboutMe.getImg_profile());
            about.setImg_banner(aboutMe.getImg_banner());
            */
            
            return this.aboutMeService.save(aboutMe);
        }
        return null;
    }
}
