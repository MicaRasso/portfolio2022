/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portfolio.MR.Repository;

import com.portfolio.MR.Model.AcademicModel;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author micae
 */
@Repository
public interface AcademicRepository extends CrudRepository<AcademicModel, Long>{
    public Optional<AcademicModel> findByTitle(String title);
    public boolean existsByTitle(String title);
    
    @Override
    public boolean existsById(Long id);
}
