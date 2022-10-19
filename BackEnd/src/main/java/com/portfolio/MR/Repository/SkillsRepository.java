/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portfolio.MR.Repository;

import com.portfolio.MR.Model.SkillsModel;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author micae
 */
@Repository
public interface SkillsRepository extends CrudRepository<SkillsModel, Long>{
    public Optional<SkillsModel> findByName(String name);
    public boolean existsByName(String name);
    
}
