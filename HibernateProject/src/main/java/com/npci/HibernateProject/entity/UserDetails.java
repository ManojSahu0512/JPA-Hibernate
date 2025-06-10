package com.npci.HibernateProject.entity;

import jakarta.persistence.*;

@Table(name = "user_details",
        //schema = "ONBOARDING",//
        uniqueConstraints = {@UniqueConstraint(columnNames = "email")},
        indexes = {@Index(name = "index_email", columnList = "email")})


@Entity
public class UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "full_name",unique = true,nullable = false,length = 255)
    private String name;
    private String email;

    //Constructors
    public UserDetails() {

    }

    public UserDetails(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
