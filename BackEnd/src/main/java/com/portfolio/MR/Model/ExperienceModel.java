
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

@Entity
@Table(name="experience")
public class ExperienceModel implements Serializable {
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
    private Long id_company;

    public ExperienceModel() {
    }

    public ExperienceModel(String title, Date iDate, Date fDate, String description, Long id_company) {
        this.title = title;
        this.iDate = iDate;
        this.fDate = fDate;
        this.description = description;
        this.id_company = id_company;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
    public String getTitle() {
        return title;
    }
    public Date getiDate() {
        return iDate;
    }

    public void setiDate(Date iDate) {
        this.iDate = iDate;
    }

    public Date getfDate() {
        return fDate;
    }

    public void setfDate(Date fDate) {
        this.fDate = fDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getId_company() {
        return id_company;
    }

    public void setId_company(Long id_company) {
        this.id_company = id_company;
    }
    
    
  
}
