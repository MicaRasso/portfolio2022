/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portfolio.MR.Repository;

import com.portfolio.MR.Model.ProyectModel;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author micae
 */
@Repository
public interface ProyectsRepository extends CrudRepository<ProyectModel, Long>{
    public Optional<ProyectModel> findByTitle(String title);
    public boolean existsByTitle(String title);
    
}
