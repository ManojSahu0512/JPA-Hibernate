package com.npci.HibernateProject.entity.GeneratedValueAnnotation;

import jakarta.persistence.*;

@Table(name = "user_details_sequence_number")
@Entity
public class GeneratedTypeSequence {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "unique_user_seq")
    @SequenceGenerator(name = "unique_user_seq",sequenceName = "db_seq_name",initialValue = 100,allocationSize = 5)
    private Long id;
    private String  name;
    private String phone;
    public GeneratedTypeSequence(String name,String phone){
        this.name=name;
        this.phone=phone;
    }



}
