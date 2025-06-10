package com.npci.HibernateProject.entity.Association.OneToOneMapping;

import jakarta.persistence.*;

@Table(name = "user_details_one_to_one")
@Entity
public class UserDetailsOneToOne {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String phone;

    @OneToOne(cascade = CascadeType.ALL)//foreign key equal to id of address table
    //by default it take user_address_id as column name, and it chooses primary key of other table
    //if you want to decide then use below one
    @JoinColumn(name = "address_id",referencedColumnName = "id")
    private UserAddress1 userAddress;

    public UserDetailsOneToOne(){

    }
}
