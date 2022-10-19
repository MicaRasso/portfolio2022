/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portfolio.MR.Repository;

import com.portfolio.MR.Model.ImgProyModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImgProyRepository  extends CrudRepository<ImgProyModel, Long> {
    
}
