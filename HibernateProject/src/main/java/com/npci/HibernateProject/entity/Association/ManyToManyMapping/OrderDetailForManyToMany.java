package com.npci.HibernateProject.entity.Association.ManyToManyMapping;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Table(name = "Order_Details_ForManyToMany")
@Entity
public class OrderDetailForManyToMany {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderNo;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "order_product",//new join table name
            joinColumns = @JoinColumn(name = "order_id"),//foreign key for Order
            inverseJoinColumns = @JoinColumn(name = "product_id")//Foreign key for Product
    )
    private List<ProductDetails> productDetailsList=new ArrayList<>();

    public Long getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(Long orderNo) {
        this.orderNo = orderNo;
    }

    public List<ProductDetails> getProductDetailsList() {
        return productDetailsList;
    }

    public void setProductDetailsList(List<ProductDetails> productDetailsList) {
        this.productDetailsList = productDetailsList;
    }
}
