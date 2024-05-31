package com.project.rest_demo.controller;



import com.project.rest_demo.model.Vendor;
import com.project.rest_demo.service.VendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

        import java.util.List;

@RestController
@RequestMapping("/vendors")
public class VendorController {

    @Autowired
    private VendorService vendorService;

    @GetMapping
    public List<Vendor> getAllVendors() {
        return vendorService.getAllVendors();
    }

    @GetMapping("/{id}")
    public Vendor getVendorById(@PathVariable("id") String vendorId) {
        return vendorService.getVendorById(vendorId);
    }

    @PostMapping
    public Vendor saveVendor(@RequestBody Vendor vendor) {
        return vendorService.saveVendor(vendor);
    }

    @PutMapping
    public Vendor updateVendor(@RequestBody Vendor vendor) {
        return vendorService.updateVendor(vendor);
    }

    @DeleteMapping("/{id}")
    public void deleteVendor(@PathVariable("id") String vendorId) {
        vendorService.deleteVendor(vendorId);
    }
}
