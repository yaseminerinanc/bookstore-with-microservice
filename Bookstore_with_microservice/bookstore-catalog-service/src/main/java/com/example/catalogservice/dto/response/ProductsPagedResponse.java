package com.example.catalogservice.dto.response;

import java.util.HashMap;
import java.util.Map;

import org.springframework.data.domain.Page;

import lombok.Data;

@Data
public class ProductsPagedResponse {
	
	 Page<ProductResponse> page;
	  Map<String, String> _links = new HashMap<>();
	    

}
