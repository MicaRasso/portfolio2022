package com.portfolio.MR.Controller;

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
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins= "http://localhost:4200/")
public class ImagesController {
    @Autowired
    ImagesService imagesService;
            
    @GetMapping("/img/get/{id}")
    public Optional<ImagesModel> getImage(@PathVariable Long id){
        return imagesService.getOne(id);
    }
    
    @PostMapping("/img/set")
    public ImagesModel saveImages(@RequestBody ImagesModel images){
        return this.imagesService.saveImages(images);
    }    
    
    @DeleteMapping("/img/delete/{id}")
    public void deleteImages(@PathVariable Long id){
        this.imagesService.deleteImages(id);
    }
}
