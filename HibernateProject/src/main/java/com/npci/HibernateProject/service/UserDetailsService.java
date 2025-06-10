package com.npci.HibernateProject.service;

import com.npci.HibernateProject.entity.UserDetails;
import com.npci.HibernateProject.repository.UserDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsService {

    @Autowired
    UserDetailsRepository userDetailsRepository;
    public void saveUser(UserDetails userDetails){
        userDetailsRepository.save(userDetails);
    }

    public UserDetails findUserById(Long primaryKey){
        return userDetailsRepository.findById(primaryKey).get();
    }

}
