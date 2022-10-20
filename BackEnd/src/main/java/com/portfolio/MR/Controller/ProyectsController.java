package com.portfolio.MR.Controller;

import com.portfolio.MR.Model.ProyectModel;
import com.portfolio.MR.Service.ProyectsService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/proyect")
@CrossOrigin(origins= "http://localhost:4200/")
public class ProyectsController {
    @Autowired
    ProyectsService proyectsService;
            
    @GetMapping("/list")
    public ResponseEntity<List<ProyectModel>> list(){
        List<ProyectModel> list;
        list = proyectsService.list();
        return new ResponseEntity(list,HttpStatus.OK);
    }
    
    @PostMapping("/set")
    public ProyectModel saveProyects(@RequestBody ProyectModel proyects){
        return this.proyectsService.save(proyects);
    }    
    
    @DeleteMapping("/delete/{id}")
    public void deleteProyects(@PathVariable Long id){
        this.proyectsService.delete(id);
    }
    
    @PostMapping("/update/{id}")     
    public void update(@PathVariable("id") Long id,@RequestBody ProyectModel proyect){
        if(proyectsService.existById(id)){
            ProyectModel proy= new ProyectModel();
            if(proyect.getTitle()!=null)
                proy.setTitle(proyect.getTitle());
            if(proyect.getDescription()!=null)
                proy.setDescription(proyect.getDescription());
            if(proyect.getfDate()!=null)
                proy.setfDate(proyect.getfDate());
            if(proyect.getLink()!=null)
                proy.setLink(proyect.getLink());
            if(proyect.getImg_URL()!=null)
                proy.setImg_URL(proyect.getImg_URL());
        }
    }
}
