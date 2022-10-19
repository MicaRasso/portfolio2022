package com.portfolio.MR.Service;


import com.portfolio.MR.Model.ImgProyModel;
import com.portfolio.MR.Repository.ImgProyRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ImgProyService {
    @Autowired
    ImgProyRepository imgProyRepository;

     public ArrayList<ImgProyModel> getExperience(){
        return (ArrayList<ImgProyModel>) imgProyRepository.findAll();
    }

    public List<ImgProyModel> list(){
        return (List<ImgProyModel>) imgProyRepository.findAll();
    }

    public Optional<ImgProyModel> getOne(long id){
        return imgProyRepository.findById(id);
    }

    public ImgProyModel save(ImgProyModel experience){
        return imgProyRepository.save(experience);
    }

    public void delete(Long id){
        imgProyRepository.deleteById(id);
    }

    public boolean existById(Long id){
        return imgProyRepository.existsById(id);
    }
    
}
