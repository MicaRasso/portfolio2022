
package com.portfolio.MR.Service;

import com.portfolio.MR.Model.ExperienceModel;
import com.portfolio.MR.Repository.ExperienceRepository;
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

    //NUEVOS!
    public List<ExperienceModel> list(){
        return (List<ExperienceModel>) experienceRepository.findAll();
    }

    public Optional<ExperienceModel> getOne(Long id){
        return experienceRepository.findById(id);
    }
    
    public Optional<ExperienceModel> getByTitle(String title){
        return experienceRepository.findByTitle(title);
    }

    public ExperienceModel save(ExperienceModel experience){
        return experienceRepository.save(experience);
    }

    public void delete(Long id){
        experienceRepository.deleteById(id);
    }

    public boolean existsByTitle(String title){
        return experienceRepository.existsByTitle(title);
    }     

    public boolean existsById(Long id) {
        return experienceRepository.existsById(id);
    }
}

