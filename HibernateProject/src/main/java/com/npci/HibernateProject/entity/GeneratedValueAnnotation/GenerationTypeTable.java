package com.npci.HibernateProject.entity.GeneratedValueAnnotation;


import jakarta.persistence.*;

@Table(name = "user_details_sequence_number")
@Entity
public class GenerationTypeTable {
    //this is  not the exact example
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE,generator = "unique_user_seq")
    @SequenceGenerator(name = "unique_user_seq",sequenceName = "db_seq_name",initialValue = 100,allocationSize = 5)
    private Long id;
    private String  name;
    private String phone;
    public GenerationTypeTable(String name,String phone){
        this.name=name;
        this.phone=phone;
    }
}
