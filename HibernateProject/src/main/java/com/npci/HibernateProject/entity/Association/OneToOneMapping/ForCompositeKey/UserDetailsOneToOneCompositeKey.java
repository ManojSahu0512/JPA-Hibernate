//package com.npci.HibernateProject.entity.Association.OneToOneMapping.ForCompositeKey;
//
//import jakarta.persistence.*;
//
//@Entity
//@Table(name = "UserDetailsOneToOneCompositeKey")
//public class UserDetailsOneToOneCompositeKey {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//    private String name;
//    private String phone;
//
//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumns({
//            @JoinColumn(name = "address_street",referencedColumnName = "street"),
//            @JoinColumn(name = "address_pin_code",referencedColumnName = "pinCode")
//    })
//    private UserAddressOneToOneCompositeKey userAddress;
//
//    public UserDetailsOneToOneCompositeKey(){
//
//    }
//    //getter setter
//
//
//}
