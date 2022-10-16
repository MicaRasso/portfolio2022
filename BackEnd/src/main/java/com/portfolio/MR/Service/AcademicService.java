
package com.portfolio.MR.Service;

import com.portfolio.MR.Model.AcademicModel;
import com.portfolio.MR.Repository.AcademicRepository;
import java.util.ArrayList;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class AcademicService {
    @Autowired
    AcademicRepository academicRepository;
    
    public ArrayList<AcademicModel> getAcademic(){
        return (ArrayList<AcademicModel>) academicRepository.findAll();
    }

    public AcademicModel saveAcademic(AcademicModel academic){
        return academicRepository.save(academic);
    }
    
    public void deleteAcademic(Long id){
        academicRepository.deleteById(id);
    }
}
