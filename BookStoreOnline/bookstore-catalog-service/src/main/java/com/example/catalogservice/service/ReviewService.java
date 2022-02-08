package com.example.catalogservice.service;

import java.util.List;

import com.example.catalogservice.dto.request.CreateOrUpdateReviewRequest;
import com.example.catalogservice.entity.Review;

public interface ReviewService {
	
	 void createOrUpdateReview(CreateOrUpdateReviewRequest createOrUpdateReviewRequest);

	    List<Review> getReviewsForProduct(String productId);

}
