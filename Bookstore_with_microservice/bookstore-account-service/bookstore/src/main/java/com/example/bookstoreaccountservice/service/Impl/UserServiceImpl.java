package com.example.bookstoreaccountservice.service.Impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.bookstoreaccountservice.dto.CreateUserRequest;
import com.example.bookstoreaccountservice.dto.GetUserInfoResponse;
import com.example.bookstoreaccountservice.dto.GetUserResponse;
import com.example.bookstoreaccountservice.dto.UpdateUserRequest;
import com.example.bookstoreaccountservice.dto.UpdateUserRequestFromAdmin;
import com.example.bookstoreaccountservice.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Override
	public String createUser(CreateUserRequest createUserRequest) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GetUserResponse getUserByUserName(String userName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GetUserResponse getUserByUserId(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GetUserInfoResponse getUserInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateUserInfo(UpdateUserRequest updateUserRequest) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteUserById(String userId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<GetUserResponse> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateUser(String userId, UpdateUserRequestFromAdmin updateUserRequestFromAdmin) {
		// TODO Auto-generated method stub
		
	}

}
