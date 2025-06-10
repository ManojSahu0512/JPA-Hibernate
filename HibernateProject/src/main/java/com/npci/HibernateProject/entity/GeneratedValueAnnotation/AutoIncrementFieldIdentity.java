package com.npci.HibernateProject.entity.GeneratedValueAnnotation;


import jakarta.persistence.*;

@Table(name = "user_detail_auto_increment_id")
@Entity
public class AutoIncrementFieldIdentity {
    //@GeneratedValue worked on only @Id with single primary key it will not work in composite key
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//Each insert,generates a new identifier(auto -increment field)
    private Long id;
    private String  name;
    private String phone;

    public AutoIncrementFieldIdentity(){

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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
