package com.example.bookstoreaccountservice.service;

import com.example.bookstoreaccountservice.dto.CreateOAuthClientRequest;
import com.example.bookstoreaccountservice.dto.CreateOAuthClientResponse;
import com.example.bookstoreaccountservice.dto.CreateUserResponse;
import com.example.bookstoreaccountservice.dto.SignUpRequest;

public interface AuthService {
	
	 CreateOAuthClientResponse createOAuthClient(CreateOAuthClientRequest createOAuthClientRequest);

	  CreateUserResponse registerUser(SignUpRequest signUpRequest);

}
