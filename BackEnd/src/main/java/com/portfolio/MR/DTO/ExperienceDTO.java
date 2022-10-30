package com.portfolio.MR.DTO;

import java.util.Date;
import javax.persistence.Temporal;
import javax.validation.constraints.NotBlank;


public class ExperienceDTO {
    @NotBlank
    private String title;
    @NotBlank
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date iDate;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fDate;
    @NotBlank
    private String description;
    @NotBlank
    private String company;

    public ExperienceDTO() {
    }

    public ExperienceDTO(String title, Date iDate, Date fDate, String description, String company) {
        this.title = title;
        this.iDate = iDate;
        this.fDate = fDate;
        this.description = description;
        this.company = company;
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

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

}
