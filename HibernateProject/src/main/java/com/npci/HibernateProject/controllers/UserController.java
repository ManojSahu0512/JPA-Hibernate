package com.npci.HibernateProject.controllers;

import com.npci.HibernateProject.entity.Association.CascadeType.MergeExp.UserDetailsMerge;
import com.npci.HibernateProject.entity.UserDetails;
import com.npci.HibernateProject.service.UserDetailsMergeService;
import com.npci.HibernateProject.service.UserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/")
public class UserController {
    @Autowired
    UserDetailsService userDetailsService;



    @GetMapping(value = "/test-jpa")
    public UserDetails getUser(){
        UserDetails user=new UserDetails("xyz","xyz@gmail.com");
        userDetailsService.saveUser(user);
        return userDetailsService.findUserById(1L);


    }



}
