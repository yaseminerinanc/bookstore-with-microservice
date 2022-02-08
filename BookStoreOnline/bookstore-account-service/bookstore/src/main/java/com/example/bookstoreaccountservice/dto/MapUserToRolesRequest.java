package com.example.bookstoreaccountservice.dto;

import java.util.List;

import lombok.Data;

@Data
public class MapUserToRolesRequest {
	
	 private List<String> roleNames;

}
