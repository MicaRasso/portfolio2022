
package com.portfolio.MR.Security.Service;

import com.portfolio.MR.Security.Entity.Role;
import com.portfolio.MR.Security.Enums.RoleName;
import com.portfolio.MR.Security.Repository.RoleRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class RoleService {
    @Autowired
    RoleRepository roleRepo;
    
    public Optional<Role> getRoleName(RoleName rolName){
        return roleRepo.findByRoleName(rolName);
    }
    
    public void save(Role role){
        roleRepo.save(role);
    }
}
