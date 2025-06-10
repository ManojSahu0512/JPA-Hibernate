package com.npci.HibernateProject.repository;

import com.npci.HibernateProject.entity.UserDetails;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDetailsRepository extends JpaRepository<UserDetails,Long> {

    //checkout part.java for all useCase

    //custom method this is also known as "drive query" because its internally convert into query
    List<UserDetails> findUserDetailsByName(String userName);

    //UseCase 1:
    List<UserDetails> findUserDetailsByNameAndPhone(String userName,String phone);

    //UseCase 2:
    List<UserDetails> findUserDetailsByNameAndPhoneOrUserId(String userName,String phone,Long id);

    //UseCase 3:
    List<UserDetails> findUserDetailsByNameIsIn(List<UserDetails> userDetails);

    @Transactional//this is mandatory
    void deleteByName(String name);




}
