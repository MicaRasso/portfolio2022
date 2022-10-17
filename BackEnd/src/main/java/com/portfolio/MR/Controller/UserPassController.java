package com.portfolio.MR.Controller;

import com.portfolio.MR.Model.UserPassModel;
import com.portfolio.MR.Service.UserPassService;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/user")
@CrossOrigin(origins= "http://localhost:4200/")
public class UserPassController {
    @Autowired
    UserPassService userService;
            
    @GetMapping("/get")
    public ArrayList<UserPassModel> getUsers(){
        return userService.getUsers();
    }
    
    @PostMapping("/set")
    public UserPassModel saveUser(@RequestBody UserPassModel user){
        return this.userService.saveUser(user);
    }
    
}
