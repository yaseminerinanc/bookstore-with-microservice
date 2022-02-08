package com.example.bookstoreaccountservice.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bookstoreaccountservice.dto.CreateRoleRequest;
import com.example.bookstoreaccountservice.entity.Role;
import com.example.bookstoreaccountservice.repository.RoleRepository;
import com.example.bookstoreaccountservice.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService {
	
	  @Autowired
	  RoleRepository roleRepository;

	@Override
	public String createRole(CreateRoleRequest createRoleRequest) {
		 Role role = Role.builder()
			        .roleName(createRoleRequest.getRoleName())
			        .roleDescription(createRoleRequest.getRoleDescription())
			        .build();

			    Role savedRole = roleRepository.save(role);
			    return savedRole.getId();
	}

	@Override
	public List<Role> getAllRoles() {
		 List<Role> allRoles = roleRepository.findAll();
		    return allRoles;
	}

}
