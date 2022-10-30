package com.portfolio.MR.Service;

import com.portfolio.MR.Model.ProyectModel;
import com.portfolio.MR.Repository.ProyectsRepository;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ProyectsService {
    @Autowired
    ProyectsRepository proyectsRepository;
    
    public List<ProyectModel> list(){
        return (List<ProyectModel>) proyectsRepository.findAll();
    }

    public Optional<ProyectModel> getOne(Long id){
        return proyectsRepository.findById(id);
    }
    
    public Optional<ProyectModel> getByTitle(String title){
        return proyectsRepository.findByTitle(title);
    }
    
    public ProyectModel save(ProyectModel proyects){
        return proyectsRepository.save(proyects);
    }    
    
    public void delete(Long id){
        proyectsRepository.deleteById(id);
    }
    
    public boolean existsByTitle(String title){
        return proyectsRepository.existsByTitle(title);
    } 

    public boolean existById(Long id){
        return proyectsRepository.existsById(id);
    }
}
