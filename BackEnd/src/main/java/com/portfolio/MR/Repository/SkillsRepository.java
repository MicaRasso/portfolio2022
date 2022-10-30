package com.portfolio.MR.Repository;

import com.portfolio.MR.Model.SkillsModel;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillsRepository extends CrudRepository<SkillsModel, Long>{
    public Optional<SkillsModel> findByName(String name);
    public boolean existsByName(String name);
    
    @Override
    public boolean existsById(Long id);
}
