package com.example.bookstoreaccountservice.service;

import com.example.bookstoreaccountservice.dto.MapRoleToUsersRequest;
import com.example.bookstoreaccountservice.dto.MapUserToRolesRequest;

public interface UserRoleService {
	
	 void mapUserToRoles(String userNameOrEmail, MapUserToRolesRequest mapUserToRolesRequest);

	  void removeRolesFromUser(String userNameOrEmail, MapUserToRolesRequest mapUserToRolesRequest);

	  void mapRoleToUsers(String roleName, MapRoleToUsersRequest mapRoleToUsersRequest);

}
