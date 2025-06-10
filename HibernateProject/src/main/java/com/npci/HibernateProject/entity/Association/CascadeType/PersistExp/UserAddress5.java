package com.npci.HibernateProject.entity.Association.CascadeType.PersistExp;

import jakarta.persistence.*;

@Table(name = "user_address")
@Entity
public class UserAddress5 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String street;
    private String city;
    private String state;
    private String country;
    private String pinCode;

    public UserAddress5(){

    }



}
