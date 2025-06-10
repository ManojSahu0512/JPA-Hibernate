package com.npci.HibernateProject.entity.Association.CascadeType.MergeExp;


import jakarta.persistence.*;

@Entity
@Table(name = "user_details_cascadeType_Persist")
public class UserDetailsMerge {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String phone;

    @OneToOne(cascade = {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.REMOVE})//it will create and  update both the table
    @JoinColumn(name = "address_id",referencedColumnName = "id")
    private UserAddressMerge userAddress;

    public UserDetailsMerge(){

    }

    public UserDetailsMerge(String name, Long id, String phone, UserAddressMerge userAddress) {
        this.name = name;
        this.id = id;
        this.phone = phone;
        this.userAddress = userAddress;
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

    public UserAddressMerge getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(UserAddressMerge userAddress) {
        this.userAddress = userAddress;
    }
}
