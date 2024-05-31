package com.project.rest_demo.model;


import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "customer")
public class Customer {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String customerId;
    private String customerName;
    private String customerAddress;
    private Long customerPhoneNumber;
    private int customerAge;



    // Getters and Setters
}
