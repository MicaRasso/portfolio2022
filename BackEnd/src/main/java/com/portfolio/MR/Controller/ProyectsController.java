package com.portfolio.MR.Controller;

import com.portfolio.MR.Model.ProyectModel;
import com.portfolio.MR.Service.ProyectsService;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin(origins= "http://localhost:4200/")
public class ProyectsController {
    @Autowired
    ProyectsService proyectsService;
            
    @GetMapping("/proyects/get")
    public ArrayList<ProyectModel> getProyects(){
        return proyectsService.getProyects();
    }
    
    @PostMapping("/proyects/set")
    public ProyectModel saveProyects(@RequestBody ProyectModel proyects){
        return this.proyectsService.saveProyects(proyects);
    }    
    
    @DeleteMapping("/proyects/delete/{id}")
    public void deleteProyects(@PathVariable Long id){
        this.proyectsService.deleteProyects(id);
    }
}
