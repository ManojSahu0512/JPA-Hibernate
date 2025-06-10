package com.npci.HibernateProject.entity.Association.ManyToManyMapping;

import jakarta.persistence.*;

@Entity
@Table(name = "product_details")
public class ProductDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productId;
    private  String name;
    private double price;

}
