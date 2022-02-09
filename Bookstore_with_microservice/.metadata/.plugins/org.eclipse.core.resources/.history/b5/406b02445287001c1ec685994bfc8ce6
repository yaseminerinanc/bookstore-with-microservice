package com.example.catalogservice.model;

import lombok.Data;
import org.springframework.data.domain.Pageable;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;

import com.example.catalogservice.entity.Product;

@Data
public class ProductResource extends EntityModel<Product> {
    
    private Pageable pageable;
    
    public ProductResource(Product content, Link... links) {
        EntityModel.of(content, links);
    }
}