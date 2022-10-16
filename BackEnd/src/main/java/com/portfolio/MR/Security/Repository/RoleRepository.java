package com.portfolio.MR.Security.Repository;

import com.portfolio.MR.Security.Entity.Role;
import com.portfolio.MR.Security.Enums.RoleName;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByRoleName(RoleName roleName);
}
