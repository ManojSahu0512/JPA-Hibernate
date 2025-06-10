package com.npci.HibernateProject.entity.DTOExample;

import com.npci.HibernateProject.DTO.UserDetailDTO;
import jakarta.persistence.*;

@Entity
@Table(name = "user_detail_entity_dto")
public class UserDetailForDto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    private String name;
    private String phone;
    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name = "address_id",referencedColumnName = "id")
    private UserAddressForDto userAddressDTO;

    public UserDetailForDto(){

    }

    public UserDetailDTO toDTO(){
        return new UserDetailDTO(this);
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

    public UserAddressForDto getUserAddressDTO() {
        return userAddressDTO;
    }

    public void setUserAddressDTO(UserAddressForDto userAddressDTO) {
        this.userAddressDTO = userAddressDTO;
    }
}
