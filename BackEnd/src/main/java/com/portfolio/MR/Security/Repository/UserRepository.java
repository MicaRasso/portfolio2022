package com.portfolio.MR.Security.Repository;

import com.portfolio.MR.Security.Entity.User;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
    Optional<User> findByUserName(String userName);
    
    boolean existsByUserName(String userName);
    boolean existsByMail(String mail);
}
