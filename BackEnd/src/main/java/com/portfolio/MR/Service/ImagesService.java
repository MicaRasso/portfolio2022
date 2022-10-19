/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portfolio.MR.Service;

import com.portfolio.MR.Model.ImagesModel;
import com.portfolio.MR.Repository.ImagesRepository;
import java.util.ArrayList;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author micae
 */
@Service
@Transactional
public class ImagesService {
    @Autowired
    ImagesRepository imagesRepository;
    
    /*public ArrayList<ImagesModel> getImages(){
        return (ArrayList<ImagesModel>) imagesRepository.findAll();
    }*/

    public ImagesModel saveImages(ImagesModel images){
        return imagesRepository.save(images);
    }    
    
    public void deleteImages(Long id){
        imagesRepository.deleteById(id);
    }
   
    public Optional<ImagesModel>getOne(long id){
        return imagesRepository.findById(id);
    }
    
    
}
