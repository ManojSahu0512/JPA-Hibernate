package com.npci.HibernateProject.entity.Association.CascadeType.PersistExp;


import jakarta.persistence.*;

@Entity
@Table(name = "user_details_cascadeType_Persist")
public class UserDetails5 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String phone;

    @OneToOne(cascade = CascadeType.PERSIST)//it will create both the table at a time
    @JoinColumn(name = "address_id",referencedColumnName = "id")
    private UserAddress5 userAddress;

    public UserDetails5(){

    }
}
