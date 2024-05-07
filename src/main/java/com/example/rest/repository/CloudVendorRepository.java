package com.example.rest.repository;

import com.example.rest.model.CloudVendor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CloudVendorRepository extends JpaRepository<CloudVendor, String> {
    List<CloudVendor> findByVendorName(String vendorName);
}
