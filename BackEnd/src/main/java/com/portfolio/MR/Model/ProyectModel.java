
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
@Table(name = "proyect")
public class ProyectModel implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true,nullable = false)
    private Long id;
    private String title;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fDate;
    private String description;
    private String link;
    private String img_URL;
    /*@OneToMany(mappedBy = "id_proy", cascade= CascadeType.ALL)
    private List<ImgProyModel> id_img=new ArrayList<>();
*/
    public ProyectModel() {
    }

    public ProyectModel(String title, Date fDate, String description, String link, String img_URL) {
        this.title = title;
        this.fDate = fDate;
        this.description = description;
        this.link = link;
        this.img_URL = img_URL;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
