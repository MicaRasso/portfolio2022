package com.portfolio.MR.Security.Service;

import com.portfolio.MR.Security.Entity.User;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.portfolio.MR.Security.Repository.UserRepository;

@Service
@Transactional
public class UserService {
    @Autowired
    UserRepository userRepo;
           
    public Optional<User> getByUserName(String userName){
        return userRepo.findByUserName(userName);
    }
            
    public boolean existsByUserName(String userName){
        return userRepo.existsByUserName(userName);
    }
    
    public boolean existsByMail(String mail){
        return userRepo.existsByMail(mail);
    }
    
    public void save(User user){
        userRepo.save(user);
    }
    
    
}
