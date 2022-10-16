/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portfolio.MR.Security.Controller;

import com.portfolio.MR.Security.JWT.JWTProvider;
import com.portfolio.MR.Security.Service.RoleService;
import com.portfolio.MR.Security.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
@CrossOrigin
public class AuthController {
    @Autowired
    PasswordEncoder passwordEnc;
    @Autowired
    AuthenticationManager authManag;
    @Autowired
    UserService userServ;
    @Autowired
    RoleService roleServ;
    @Autowired
    JWTProvider jwtProv;
    
    
}
