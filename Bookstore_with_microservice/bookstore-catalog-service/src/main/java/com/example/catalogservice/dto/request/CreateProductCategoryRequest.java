package com.example.catalogservice.dto.request;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateProductCategoryRequest {

    @NotNull(message = "productCategoryName should not be null!")
    @NotEmpty(message = "productCategoryName should not be empty!")
    private String productCategoryName;
    private String description;

}

