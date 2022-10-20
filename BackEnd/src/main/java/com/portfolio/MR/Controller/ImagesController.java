package com.portfolio.MR.Controller;

import com.portfolio.MR.Model.AcademicModel;
import com.portfolio.MR.Model.ImagesModel;
import com.portfolio.MR.Service.ImagesService;
import java.util.ArrayList;
import java.util.Optional;
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
@RequestMapping("/img")
@CrossOrigin(origins= "http://localhost:4200/")
public class ImagesController {
    @Autowired
    ImagesService imagesService;
            
    @GetMapping("/get/{id}")
    public Optional<ImagesModel> getImage(@PathVariable Long id){
        return imagesService.getOne(id);
    }
    
    @PostMapping("/set")
    public ImagesModel saveImages(@RequestBody ImagesModel images){
        return this.imagesService.saveImages(images);
    }    
    
    @DeleteMapping("/delete/{id}")
    public void deleteImages(@PathVariable Long id){
        this.imagesService.deleteImages(id);
    }
    
    
    @PostMapping("/update/{id}")     
    public void update(@PathVariable("id") Long id,@RequestBody ImagesModel image){
        if(imagesService.existById(id)){
            ImagesModel img= new ImagesModel();
            if(image.getAlt()!=null)
                img.setAlt(image.getAlt());
            if(image.getUrl()!=null)
                img.setUrl(image.getUrl());            
        }
    }
}
