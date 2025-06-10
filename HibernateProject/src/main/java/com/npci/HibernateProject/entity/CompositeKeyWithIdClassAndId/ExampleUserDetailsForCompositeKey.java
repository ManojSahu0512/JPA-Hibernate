package com.npci.HibernateProject.entity.CompositeKeyWithIdClassAndId;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;

@Table(name = "user_detail_composite")
@IdClass(UserDetailsCompositeKey.class)
@Entity
public class ExampleUserDetailsForCompositeKey {
    @Id//both are not equal this and below one consider as composite key
    private String userName;
    @Id
    private String address;
    private String phoneNum;
    public ExampleUserDetailsForCompositeKey(){

    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }
}
