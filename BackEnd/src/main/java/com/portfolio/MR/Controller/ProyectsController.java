package com.portfolio.MR.Controller;

import com.portfolio.MR.DTO.ProyectsDTO;
import com.portfolio.MR.Model.ProyectModel;
import com.portfolio.MR.Service.ProyectsService;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
    public ResponseEntity<List<ProyectModel>> list() {
        List<ProyectModel> list = proyectsService.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }

    @GetMapping("/detail/{id}")
    public ResponseEntity<ProyectModel> getById(@PathVariable("id") Long id) {
        if (!proyectsService.existById(id)) {
            return new ResponseEntity(new Message("no existe"), HttpStatus.NOT_FOUND);
        }
        ProyectModel hYs = proyectsService.getOne(id).get();
        return new ResponseEntity(hYs, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Long id) {
        if (!proyectsService.existById(id)) {
            return new ResponseEntity(new Message("no existe"), HttpStatus.NOT_FOUND);
        }
        proyectsService.delete(id);
        return new ResponseEntity(new Message("proyecto eliminado"), HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody ProyectsDTO dtopro) {
        if (StringUtils.isBlank(dtopro.getTitle())) {
            return new ResponseEntity(new Message("El titulo es obligatorio"), HttpStatus.BAD_REQUEST);
        }
        if (StringUtils.isBlank((CharSequence) dtopro.getDescription())) {
            return new ResponseEntity(new Message("La descripcion es obligatoria"), HttpStatus.BAD_REQUEST);
        }

        ProyectModel ski = new ProyectModel(dtopro.getTitle(), dtopro.getfDate(),dtopro.getDescription(),dtopro.getLink(),dtopro.getImg_URL());
        proyectsService.save(ski);

        return new ResponseEntity(new Message("Skill agregada"), HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") Long id, @RequestBody ProyectsDTO dtopro) {
        if (!proyectsService.existById(id)) {
            return new ResponseEntity(new Message("El ID no existe"), HttpStatus.BAD_REQUEST);
        }
        if (StringUtils.isBlank(dtopro.getTitle())) {
            return new ResponseEntity(new Message("El titulo es obligatorio"), HttpStatus.BAD_REQUEST);
        }
        if (StringUtils.isBlank((CharSequence) dtopro.getDescription())) {
            return new ResponseEntity(new Message("La descripcion es obligatoria"), HttpStatus.BAD_REQUEST);
        }

        ProyectModel pro = proyectsService.getOne(id).get();
        pro.setTitle(dtopro.getTitle());
        pro.setDescription(dtopro.getDescription());
        pro.setLink(dtopro.getLink());
        pro.setImg_URL(dtopro.getImg_URL());
        pro.setfDate(dtopro.getfDate());

        proyectsService.save(pro);
        return new ResponseEntity(new Message("Skill actualizada"), HttpStatus.OK);

    }

}
