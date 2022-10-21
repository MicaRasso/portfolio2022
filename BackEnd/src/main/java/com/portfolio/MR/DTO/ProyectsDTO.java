package com.portfolio.MR.DTO;

import java.util.Date;
import javax.persistence.Temporal;
import javax.validation.constraints.NotBlank;

public class ProyectsDTO {
    @NotBlank
    private String title;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fDate;
    @NotBlank
    private String description;
    private String link;
    private String img_URL;

    public ProyectsDTO() {
    }

    public ProyectsDTO(String title, Date fDate, String description, String link, String img_URL) {
        this.title = title;
        this.fDate = fDate;
        this.description = description;
        this.link = link;
        this.img_URL = img_URL;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getImg_URL() {
        return img_URL;
    }

    public void setImg_URL(String img_URL) {
        this.img_URL = img_URL;
    }
    
    
    
}
