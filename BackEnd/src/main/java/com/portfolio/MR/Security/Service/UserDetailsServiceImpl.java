/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portfolio.MR.Security.Service;

import com.portfolio.MR.Security.Entity.AdminUser;
import com.portfolio.MR.Security.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService{
    @Autowired
    UserService userServ;
  
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user= userServ.getByUserName(username).get();
         return (UserDetails) AdminUser.build(user);
    }
    
}
