package com.project.rest_demo.model;


import javax.persistence.*;

@Entity

@Table(name = "customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String customerId;
    private String customerName;
    private String customerAddress;
    private String customerPhoneNumber;

    @ManyToOne
    private Vendor vendor;

    // Getters and Setters
}
