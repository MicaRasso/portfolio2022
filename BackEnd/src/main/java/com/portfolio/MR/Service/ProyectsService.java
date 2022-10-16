package com.portfolio.MR.Service;

import com.portfolio.MR.Model.ProyectModel;
import com.portfolio.MR.Repository.ProyectsRepository;
import java.util.ArrayList;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ProyectsService {
    @Autowired
    ProyectsRepository proyectsRepository;
    
    public ArrayList<ProyectModel> getProyects(){
        return (ArrayList<ProyectModel>) proyectsRepository.findAll();
    }

    public ProyectModel saveProyects(ProyectModel proyects){
        return proyectsRepository.save(proyects);
    }    
    
    public void deleteProyects(Long id){
        proyectsRepository.deleteById(id);
    }
}
