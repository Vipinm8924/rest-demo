package com.project.rest_demo.service;


import com.project.rest_demo.model.Vendor;
import com.project.rest_demo.repository.VendorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VendorService {

    @Autowired
    private VendorRepository vendorRepository;

    public List<Vendor> getAllVendors() {
        return vendorRepository.findAll();
    }

    public Vendor getVendorById(String vendorId) {
        return vendorRepository.findById(vendorId).orElse(null);
    }

    public Vendor saveVendor(Vendor vendor) {
        return vendorRepository.save(vendor);
    }

    public Vendor updateVendor(Vendor vendor) {
        return vendorRepository.save(vendor);
    }

    public void deleteVendor(String vendorId) {
        vendorRepository.deleteById(vendorId);
    }
}

