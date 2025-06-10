package com.npci.HibernateProject.controllers;

import com.npci.HibernateProject.entity.Association.CascadeType.MergeExp.UserDetailsMerge;
import com.npci.HibernateProject.service.UserDetailsMergeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/apiMerge")
public class UserControllerCascadeTypeMerge {
    @Autowired
    UserDetailsMergeService userDetailsMergeService;
    @PostMapping(path = "/user")
    public UserDetailsMerge insertUser(@RequestBody UserDetailsMerge userDetailsMerge ){
        return userDetailsMergeService.saveUserMerge(userDetailsMerge);
    }

    @PutMapping(path = "/user/{id}")
    public UserDetailsMerge updateUser(@PathVariable Long id,@RequestBody UserDetailsMerge userDetailsMerge){
        return userDetailsMergeService.updateUserMerge(id,userDetailsMerge);
    }

    @DeleteMapping(value = "/user/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long id){
        userDetailsMergeService.deleteUser(id);
        return ResponseEntity.noContent().build();

    }
    
}
