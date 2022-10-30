
package com.portfolio.MR.Service;

import com.portfolio.MR.Model.AcademicModel;
import com.portfolio.MR.Repository.AcademicRepository;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class AcademicService {
    @Autowired
    AcademicRepository academicRepository;
    
     public List<AcademicModel> list(){
        return (List<AcademicModel>) academicRepository.findAll();
    }

    public Optional<AcademicModel> getOne(Long id){
        return academicRepository.findById(id);
    }

    public AcademicModel save(AcademicModel academic){
        return academicRepository.save(academic);
    }
    
    public void delete(Long id){
        academicRepository.deleteById(id);
    }
    
    public boolean existsByTitle(String title){
        return academicRepository.existsByTitle(title);
    } 

    public boolean existById(Long id){
        return academicRepository.existsById(id);
    }
    
    public Optional<AcademicModel> getByTitle(String title){
        return academicRepository.findByTitle(title);
    }   
    
}
