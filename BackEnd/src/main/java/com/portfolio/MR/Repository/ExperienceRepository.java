/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portfolio.MR.Repository;

import com.portfolio.MR.Model.ExperienceModel;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository 
public interface ExperienceRepository extends JpaRepository<ExperienceModel, Long>{
    public Optional<ExperienceModel> findByTitle(String title);
    public boolean existsByTitle(String title);

    public boolean existsById(Long id);
 }

