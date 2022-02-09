package com.example.billingservice.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.billingservice.entitiy.Address;

public interface AddressRepository extends JpaRepository<Address,String> {
	
    Optional<List<Address>> findByUserId(String userId);

    Optional<Address> findByAddressId(String addressId);

    Boolean existsByUserId(String userId);

}
