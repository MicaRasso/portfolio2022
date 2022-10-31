package com.portfolio.MR.Controller;

import com.portfolio.MR.Model.UserPassModel;
import com.portfolio.MR.Service.UserPassService;
import java.util.ArrayList;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/userVal")
@CrossOrigin(origins= "http://localhost:4200/")
public class UserPassController {
    @Autowired
    UserPassService userService;

    @GetMapping("/get/{id}")
    public Optional<UserPassModel> getOne(@PathVariable Long id){
        return this.userService.getOne(id);
    }
    
    @PostMapping("/validate")
    public boolean validateUser(@RequestBody UserPassModel user){
        if(user.getPassword() != null && user.getMail() != null){
            return user.getPassword().equals(userService.getPassword(1)) && user.getMail().equals(userService.getMail(1)); 
        }
        return false;
    }
   
    
    
}
