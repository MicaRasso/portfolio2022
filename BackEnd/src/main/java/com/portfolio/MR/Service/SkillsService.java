/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portfolio.MR.Service;

import com.portfolio.MR.Model.SkillsModel;
import com.portfolio.MR.Repository.SkillsRepository;
import java.util.ArrayList;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author micae
 */
@Service
@Transactional
public class SkillsService {
    @Autowired
    SkillsRepository skillsRepository;
    
    public ArrayList<SkillsModel> getSkills(){
        return (ArrayList<SkillsModel>) skillsRepository.findAll();
    }

    public SkillsModel saveSkills(SkillsModel skills){
        return skillsRepository.save(skills);
    }
    
    public void deleteSkills(Long id){
        skillsRepository.deleteById(id);
    }
}
