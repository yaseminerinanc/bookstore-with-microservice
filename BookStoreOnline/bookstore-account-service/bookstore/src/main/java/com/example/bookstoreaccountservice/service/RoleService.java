package com.example.bookstoreaccountservice.service;

import java.util.List;

import com.example.bookstoreaccountservice.dto.CreateRoleRequest;
import com.example.bookstoreaccountservice.entity.Role;

public interface RoleService {
	
	  String createRole(CreateRoleRequest createRoleRequest);

	  List<Role> getAllRoles();

}
