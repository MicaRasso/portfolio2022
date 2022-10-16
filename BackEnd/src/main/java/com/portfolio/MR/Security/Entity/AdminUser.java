package com.portfolio.MR.Security.Entity;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;


public class AdminUser implements UserDetails{
    private String userName;
    private String mail;
    private String password;
    private Collection<? extends GrantedAuthority> authorities;

    public AdminUser(String userName, String mail, String password, Collection<? extends GrantedAuthority> authorities) {
        this.userName = userName;
        this.mail = mail;
        this.password = password;
        this.authorities = authorities;
    }
 
    public static AdminUser build(User user){
        List<GrantedAuthority> authorities; 
        authorities = user.getRoles().stream().map(role -> new SimpleGrantedAuthority(role.getRoleName().name())).collect(Collectors.toList());
        return new AdminUser(user.getUserName(),user.getMail(),user.getPassword(),authorities);
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return this.authorities;
    }

    @Override
    public String getPassword() {
        return this.password;
    }

    @Override
    public String getUsername() {
        return this.userName;
    }

    public String getMail() {
        return this.mail;
    }
    
    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }




}
