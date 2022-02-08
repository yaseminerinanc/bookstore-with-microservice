package com.example.catalogservice.service.Impl;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.catalogservice.dto.request.CreateProductCategoryRequest;
import com.example.catalogservice.dto.request.UpdateProductCategoryRequest;
import com.example.catalogservice.entity.ProductCategory;
import com.example.catalogservice.repository.ProductCategoryRepository;
import com.example.catalogservice.service.ProductCategoryService;

@Service
public class ProductCategoryServiceImpl implements ProductCategoryService {
	
	 @Autowired
	    ProductCategoryRepository productCategoryRepository;

	@Override
	public String createProductCategory(@Valid CreateProductCategoryRequest createProductCategoryRequest) {
		

	        ProductCategory productCategory = ProductCategory.builder()
	                .productCategoryName(createProductCategoryRequest.getProductCategoryName())
	                .description(createProductCategoryRequest.getDescription())
	                .build();

	        ProductCategory savedProductCategory = productCategoryRepository.save(productCategory);
	        return savedProductCategory.getProductCategoryId();
	}

	@Override
	public ProductCategory getProductCategory(String productCategoryId) {
		
		  Optional<ProductCategory> productCategoryOptional = productCategoryRepository.findById(productCategoryId);

	      ProductCategory productCategory = productCategoryOptional.orElseThrow(() -> new RuntimeException("Product Category doesn't exist!"));

	       return productCategory;
	}

	@Override
	public void deleteProductCategory(String productCategoryId) {
		
		 productCategoryRepository.deleteById(productCategoryId);
		
	}

	@Override
	public void updateProductCategory(UpdateProductCategoryRequest updateProductCategoryRequest) {
		  ProductCategory getProductCategory =
	                this.getProductCategory(updateProductCategoryRequest.getProductCategoryId());

	        ProductCategory productCategory = ProductCategory.builder()
	                .productCategoryId(updateProductCategoryRequest.getProductCategoryId())
	                .productCategoryName(updateProductCategoryRequest.getProductCategoryName())
	                .description(updateProductCategoryRequest.getDescription())
	                .build();

	        productCategory.setCreatedAt(getProductCategory.getCreatedAt());

	        productCategoryRepository.save(productCategory);
		
	}

	@Override
	public Page<ProductCategory> getAllProductCategories(String sort, Integer page, Integer size) {
		
		  if (size == null || size == 0) {
	            size = 20;
	        }
	        
	        if (page == null || page == 0) {
	            page = 0;
	        }
	        
	        Pageable pageable;
	        
	        if (sort == null) {
	            pageable = PageRequest.of(page, size);
	        } else {
	            Sort.Order order;
	            
	            try {
	                String[] split = sort.split(",");
	                
	                Sort.Direction sortDirection = Sort.Direction.fromString(split[1]);
	                order = new Sort.Order(sortDirection, split[0]).ignoreCase();
	                pageable = PageRequest.of(page, size, Sort.by(order));
	                
	            } catch (Exception e) {
	                throw new RuntimeException("Not a valid sort value, It should be 'fieldName,direction', example : 'productCategoryName,asc");
	            }
	            
	        }
	        
	        return productCategoryRepository.findAll(pageable);
	}

}
