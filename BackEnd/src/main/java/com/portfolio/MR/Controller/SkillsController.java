
package com.portfolio.MR.Controller;

import com.portfolio.MR.DTO.SkillsDTO;
import com.portfolio.MR.Model.SkillsModel;
import com.portfolio.MR.Service.SkillsService;
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
@RequestMapping("/skills")
@CrossOrigin(origins= "http://localhost:4200/")
public class SkillsController {
    @Autowired
    SkillsService skillsService;
 
     @GetMapping("/list")
    public ResponseEntity<List<SkillsModel>> list() {
        List<SkillsModel> list = skillsService.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }

    @GetMapping("/detail/{id}")
    public ResponseEntity<SkillsModel> getById(@PathVariable("id") Long id) {
        if (!skillsService.existById(id)) {
            return new ResponseEntity(new Message("no existe"), HttpStatus.NOT_FOUND);
        }
        SkillsModel hYs = skillsService.getOne(id).get();
        return new ResponseEntity(hYs, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Long id) {
        if (!skillsService.existById(id)) {
            return new ResponseEntity(new Message("no existe"), HttpStatus.NOT_FOUND);
        }
        skillsService.delete(id);
        return new ResponseEntity(new Message("Skill eliminado"), HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody SkillsDTO dtoski) {
        if (StringUtils.isBlank(dtoski.getName())) {
            return new ResponseEntity(new Message("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        }
        if (StringUtils.isBlank((CharSequence) dtoski.getPercentage())) {
            return new ResponseEntity(new Message("El porcentaje es obligatorio"), HttpStatus.BAD_REQUEST);
        }

        SkillsModel ski = new SkillsModel(dtoski.getName(), dtoski.getPercentage(),dtoski.isHard());
        skillsService.save(ski);

        return new ResponseEntity(new Message("Skill agregada"), HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") Long id, @RequestBody SkillsDTO dtoski) {
        if (!skillsService.existById(id)) {
            return new ResponseEntity(new Message("El ID no existe"), HttpStatus.BAD_REQUEST);
        }
        if (StringUtils.isBlank(dtoski.getName())) {
            return new ResponseEntity(new Message("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        }
        if (StringUtils.isBlank((CharSequence) dtoski.getPercentage())) {
            return new ResponseEntity(new Message("El porcentaje es obligatorio"), HttpStatus.BAD_REQUEST);
        }

        SkillsModel ski = skillsService.getOne(id).get();
        ski.setName(dtoski.getName());
        ski.setPercentage(dtoski.getPercentage());

        skillsService.save(ski);
        return new ResponseEntity(new Message("Skill actualizada"), HttpStatus.OK);

    }
}