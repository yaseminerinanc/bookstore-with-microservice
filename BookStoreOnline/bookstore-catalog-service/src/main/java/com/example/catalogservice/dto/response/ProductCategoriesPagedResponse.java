package com.example.catalogservice.dto.response;

import java.util.HashMap;
import java.util.Map;

import org.springframework.data.domain.Page;

import com.example.catalogservice.entity.ProductCategory;

import lombok.Data;

@Data
public class ProductCategoriesPagedResponse {
	
    Page<ProductCategory> page;
    Map<String, String> _links = new HashMap<>();

}
