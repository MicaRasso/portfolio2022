
package com.portfolio.MR.DTO;

import java.util.Date;
import javax.persistence.Temporal;


public class ExperienceDTO {
    private String title;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date iDate;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fDate;
    private String description;
    private Long id_company;

    public ExperienceDTO() {
    }

    public ExperienceDTO(String title, Date iDate, Date fDate, String description, Long id_company) {
        this.title = title;
        this.iDate = iDate;
        this.fDate = fDate;
        this.description = description;
        this.id_company = id_company;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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
