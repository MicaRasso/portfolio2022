
package com.portfolio.MR.Service;

import com.portfolio.MR.Model.ExperienceModel;
import com.portfolio.MR.Repository.ExperienceRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ExperienceService {
    @Autowired
    ExperienceRepository experienceRepository;
    
    public ArrayList<ExperienceModel> getExperience(){
        return (ArrayList<ExperienceModel>) experienceRepository.findAll();
    }

    public ExperienceModel saveExperience(ExperienceModel experience){
        return experienceRepository.save(experience);
    }

    public void deleteExperience(Long id){
        experienceRepository.deleteById(id);
    }
    
    //NUEVOS!
    public List<ExperienceModel> list(){
        return (List<ExperienceModel>) experienceRepository.findAll();
    }

    public Optional<ExperienceModel> getOne(long id){
        return experienceRepository.findById(id);
    }
/*    
    public Optional<ExperienceModel> findByNombre(String name){
        return experienceRepository.findByNameE(name);
    }
    
    public boolean existsByNombre(String name){
        return experienceRepository.existsByNameE(name);
    }
 */ 
    public boolean existById(Long id){
        return experienceRepository.existsById(id);
    }
    
    //copiados de arriba con el nombre mas corto
    public ExperienceModel save(ExperienceModel experience){
        return experienceRepository.save(experience);
    }

    public void delete(Long id){
        experienceRepository.deleteById(id);
    }
}

