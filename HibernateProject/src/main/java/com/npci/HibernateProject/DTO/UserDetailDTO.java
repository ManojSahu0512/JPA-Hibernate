package com.npci.HibernateProject.DTO;

import com.npci.HibernateProject.entity.DTOExample.UserDetailForDto;

public class UserDetailDTO {
    private Long id;
    private String name;
    private String phone;
    private String address;

    public  UserDetailDTO(UserDetailForDto userDetailForDto){
        this.id= userDetailForDto.getId();
        this.name=userDetailForDto.getName();
        this.phone= userDetailForDto.getPhone();
        System.out.println("going to query user address here now");
        this.address=userDetailForDto.getUserAddressDTO()!=null?userDetailForDto.getUserAddressDTO().getStreet():null;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
