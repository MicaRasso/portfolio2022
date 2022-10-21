package com.portfolio.MR.DTO;

import java.util.Date;
import javax.persistence.Temporal;

public class AcademicDTO {
private String title;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date iDate;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fDate;
    private String description;
    private String institute;

    public AcademicDTO() {
    }

    public AcademicDTO(String title, Date iDate, Date fDate, String description, String institute) {
        this.title = title;
        this.iDate = iDate;
        this.fDate = fDate;
        this.description = description;
        this.institute = institute;
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

    public String getInstitute() {
        return institute;
    }

    public void setInstitute(String institute) {
        this.institute = institute;
    }

       
}
