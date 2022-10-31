/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portfolio.MR.Service;

import com.portfolio.MR.Model.AboutMeModel;
import com.portfolio.MR.Repository.AboutMeRepository;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class AboutMeService {
    @Autowired
    AboutMeRepository aboutMeRepository;
    
    public List<AboutMeModel> list(){
        return (List<AboutMeModel>) aboutMeRepository.findAll();
    }
    
    public Optional<AboutMeModel> getOne(Long id){
        return aboutMeRepository.findById(id);
    }

    public AboutMeModel save(AboutMeModel aboutMe){
        return aboutMeRepository.save(aboutMe);
    }
    
    public void delete(Long id){
        aboutMeRepository.deleteById(id);
    }
     
    public boolean existById(Long id){
        return aboutMeRepository.existsById(id);
    }
}
