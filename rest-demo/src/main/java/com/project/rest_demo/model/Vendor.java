package com.project.rest_demo.model;


import jdk.jfr.DataAmount;
import lombok.Data;

import javax.persistence.*;
@Data
@Entity
@Table(name = "vendor")
public class Vendor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String vendorId;
    private String vendorName;
    private String vendorAddress;
    private String vendorPhoneNumber;

    // Getters and Setters
}

