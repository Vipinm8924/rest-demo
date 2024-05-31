package com.project.rest_demo.controller;

import com.project.rest_demo.model.CloudVendor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorAPIService
{
    CloudVendor cloudVendor;
    @GetMapping("{vendorId}")
    public CloudVendor getCloudVendorDetails(String vendorId)
    {
        return cloudVendor;
//                new CloudVendor( "V1","VPN",
//                "Address One", "xxxxxxx");
    }
    @PostMapping
    public String createCloudeVendorDetails(@RequestBody CloudVendor cloudVendor)
    {
        this.cloudVendor = cloudVendor;
        return "Cloud Vendor Created Successfully";
    }

    @PutMapping
    public String updateCloudeVendorDetails(@RequestBody CloudVendor cloudVendor)
    {
        this.cloudVendor = cloudVendor;
        return "Cloud Vendor Updated Successfully";
    }

    @DeleteMapping
    public String deleteCloudeVendorDetails(@RequestBody CloudVendor cloudVendor)
    {
        this.cloudVendor = null;
        return "Cloud Vendor Deleted Successfully";
    }
}


