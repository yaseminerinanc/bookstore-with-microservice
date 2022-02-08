package com.example.bookstoreaccountservice.dto;

import java.util.Set;

import com.example.bookstoreaccountservice.entity.Role;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class GetUserResponse {

  private String userId;
  private String userName;
  private String firstName;
  private String lastName;
  private String email;
  private Set<Role> roles;

	
  }
