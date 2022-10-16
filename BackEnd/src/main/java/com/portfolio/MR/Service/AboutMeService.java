/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portfolio.MR.Service;

import com.portfolio.MR.Model.AboutMeModel;
import com.portfolio.MR.Repository.AboutMeRepository;
import java.util.ArrayList;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class AboutMeService {
    @Autowired
    AboutMeRepository aboutMeRepository;
    
    public ArrayList<AboutMeModel> getAboutMe(){
        return (ArrayList<AboutMeModel>) aboutMeRepository.findAll();
    }
    public Optional<AboutMeModel> getAboutMe1(Long id){
        return aboutMeRepository.findById(id);
    }

    public AboutMeModel saveAboutMe(AboutMeModel aboutMe){
        return aboutMeRepository.save(aboutMe);
    }
}
