package com.portfolio.MR.Security.Entity;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotNull;

public class User{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
    @NotNull
    @Column(unique=true)
    private String userName;
    @NotNull
    private String mail;
    @NotNull
    private String password;
    @ManyToMany(fetch=FetchType.EAGER)
    @JoinTable(name="user_role", joinColumns= @JoinColumn(name="user_id"),inverseJoinColumns= @JoinColumn(name="role_id"))
    private Set<Role> roles= new HashSet<>();
    
    public User() {
    }

    public User(String userName, String mail, String password) {
        this.userName = userName;
        this.mail = mail;
        this.password = password;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    

    
    
}
