/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portfolio.MR.Model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="img")
public class ImagesModel implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    @Column(unique = true,nullable = false)
    private Long id;
    @NotNull
    private String url;
    @NotNull
    private String alt;

    public ImagesModel() {
    }

    public ImagesModel(Long id, String url, String alt) {
        this.id = id;
        this.url = url;
        this.alt = alt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getAlt() {
        return alt;
    }

    public void setAlt(String alt) {
        this.alt = alt;
    }
    
}
