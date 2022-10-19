/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portfolio.MR.Model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author micae
 */
@Entity
@Table(name="imgproy")
public class ImgProyModel {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    private ProyectModel id_proy;

    public ImgProyModel() {
    }

    public ImgProyModel(ProyectModel id_proy) {
        this.id_proy = id_proy;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ProyectModel getId_proy() {
        return id_proy;
    }

    public void setId_proy(ProyectModel id_proy) {
        this.id_proy = id_proy;
    }

    
    
}
