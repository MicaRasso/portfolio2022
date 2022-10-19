/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portfolio.MR.Model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author micae
 */
@Entity
@Table(name = "academic")
public class AcademicModel implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true,nullable = false)
    private Long id;
    private String title;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date iDate;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fDate;
    private String description;
    private Long id_institute;

    public AcademicModel() {
    }

    public AcademicModel(String title, Date iDate, Date fDate, String description, Long id_institute) {
        this.title = title;
        this.iDate = iDate;
        this.fDate = fDate;
        this.description = description;
        this.id_institute = id_institute;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
    public void setiDate(Date iDate) {
        this.iDate = iDate;
    }

    public void setfDate(Date fDate) {
        this.fDate = fDate;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setId_institute(Long id_institute) {
        this.id_institute = id_institute;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }
    
    public Date getiDate() {
        return iDate;
    }

    public Date getfDate() {
        return fDate;
    }

    public String getDescription() {
        return description;
    }

    public Long getId_institute() {
        return id_institute;
    }
    
    
}
