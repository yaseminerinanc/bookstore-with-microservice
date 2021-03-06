package com.example.billingservice.service;

import java.util.List;

import com.example.billingservice.dto.request.CreateAddressRequest;
import com.example.billingservice.dto.request.UpdateAddressRequest;
import com.example.billingservice.dto.response.GetAddressResponse;

public interface AddressService {
	
	  void createAddress(CreateAddressRequest createAddressRequest);

	  List<GetAddressResponse> getAddress();

	  void updateAddress(UpdateAddressRequest updateAddressRequest);

	  GetAddressResponse getAddressById(String addressId);

	  void deleteAddressById(String addressId);

}
