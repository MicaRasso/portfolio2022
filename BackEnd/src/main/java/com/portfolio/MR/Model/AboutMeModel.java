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
import javax.validation.constraints.NotNull;


@Entity
@Table(name = "aboutme")
public class AboutMeModel implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true,nullable = false)
    private Long id;
    @NotNull
    private String name;
    @NotNull
    private String lastname;
    @NotNull
    private String title;
    private String description;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date birthday;
    private String img_profile;
    private String img_banner;

    public AboutMeModel() {
    }

    public AboutMeModel(Long id, String name, String lastname, String title, String description, Date birthday, String img_profile, String img_banner) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.title = title;
        this.description = description;
        this.birthday = birthday;
        this.img_profile = img_profile;
        this.img_banner = img_banner;
    }

    public String getImg_profile() {
        return img_profile;
    }

    public void setImg_profile(String img_profile) {
        this.img_profile = img_profile;
    }

    public String getImg_banner() {
        return img_banner;
    }

    public void setImg_banner(String img_banner) {
        this.img_banner = img_banner;
    }

    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
    
}
