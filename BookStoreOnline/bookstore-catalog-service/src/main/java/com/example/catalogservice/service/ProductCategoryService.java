package com.example.catalogservice.service;

import javax.validation.Valid;

import org.springframework.data.domain.Page;

import com.example.catalogservice.dto.request.CreateProductCategoryRequest;
import com.example.catalogservice.dto.request.UpdateProductCategoryRequest;
import com.example.catalogservice.entity.ProductCategory;

public interface ProductCategoryService {
	
	 String createProductCategory(@Valid CreateProductCategoryRequest createProductCategoryRequest);

	  ProductCategory getProductCategory(String productCategoryId);

	  void deleteProductCategory(String productCategoryId);

	  void updateProductCategory(UpdateProductCategoryRequest updateProductCategoryRequest);

	  Page<ProductCategory> getAllProductCategories(String sort, Integer page, Integer size);

}
