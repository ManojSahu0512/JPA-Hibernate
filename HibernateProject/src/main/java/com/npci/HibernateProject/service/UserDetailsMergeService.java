package com.npci.HibernateProject.service;

import com.npci.HibernateProject.entity.Association.CascadeType.MergeExp.UserDetailsMerge;
import com.npci.HibernateProject.repository.UserDetailsCascadeTypeMergeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class UserDetailsMergeService {
    @Autowired
    UserDetailsCascadeTypeMergeRepository userDetailsCascadeTypeMergeRepository;

    public UserDetailsMerge saveUserMerge(UserDetailsMerge userDetailsMerge){
        userDetailsCascadeTypeMergeRepository.save(userDetailsMerge);
        return userDetailsMerge;
    }


    public UserDetailsMerge updateUserMerge(Long id, UserDetailsMerge userDetailsMerge) {
        Optional<UserDetailsMerge> existingUser=userDetailsCascadeTypeMergeRepository.findById(id);
        if(existingUser.isPresent()){
           return userDetailsCascadeTypeMergeRepository.save(userDetailsMerge);
        }
        return  null;
    }

    public void deleteUser(Long id) {
        userDetailsCascadeTypeMergeRepository.deleteById(id);
    }
}
