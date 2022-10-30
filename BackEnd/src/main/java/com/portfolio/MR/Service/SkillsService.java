/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portfolio.MR.Service;

import com.portfolio.MR.Model.SkillsModel;
import com.portfolio.MR.Repository.SkillsRepository;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class SkillsService {
    @Autowired
    SkillsRepository skillsRepository;
    
     public List<SkillsModel> list(){
        return (List<SkillsModel>) skillsRepository.findAll();
    }

    public Optional<SkillsModel> getOne(Long id){
        return skillsRepository.findById(id);
    }
    
    public SkillsModel save(SkillsModel skills){
        return skillsRepository.save(skills);
    }
    
    public void delete(Long id){
        skillsRepository.deleteById(id);
    }

    public boolean existById(Long id){
        return skillsRepository.existsById(id);
    }
}
