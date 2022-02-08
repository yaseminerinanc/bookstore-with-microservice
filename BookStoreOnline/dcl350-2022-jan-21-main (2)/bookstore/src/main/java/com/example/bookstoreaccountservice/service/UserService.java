package com.example.bookstoreaccountservice.service;

import java.util.List;

import com.example.bookstoreaccountservice.dto.CreateUserRequest;
import com.example.bookstoreaccountservice.dto.GetUserInfoResponse;
import com.example.bookstoreaccountservice.dto.GetUserResponse;
import com.example.bookstoreaccountservice.dto.UpdateUserRequest;
import com.example.bookstoreaccountservice.dto.UpdateUserRequestFromAdmin;

public interface UserService {
	
	 String createUser(CreateUserRequest createUserRequest);

	  GetUserResponse getUserByUserName(String userName);

	  GetUserResponse getUserByUserId(String userId);

	  GetUserInfoResponse getUserInfo();

	  void updateUserInfo(UpdateUserRequest updateUserRequest);

	  void deleteUserById(String userId);

	  List<GetUserResponse> getAllUsers();

	  void updateUser(String userId, UpdateUserRequestFromAdmin updateUserRequestFromAdmin);

}
