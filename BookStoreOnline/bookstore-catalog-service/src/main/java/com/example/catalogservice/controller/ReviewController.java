package com.example.catalogservice.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.catalogservice.dto.request.CreateOrUpdateReviewRequest;
import com.example.catalogservice.entity.Review;
import com.example.catalogservice.service.ReviewService;

@RestController
public class ReviewController {

    @Autowired
    ReviewService reviewService;

    @PostMapping("/review")
    public ResponseEntity<?> createOrUpdateReview(@RequestBody @Valid CreateOrUpdateReviewRequest createOrUpdateReviewRequest) {

        reviewService.createOrUpdateReview(createOrUpdateReviewRequest);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/review")
    public ResponseEntity<?> getAllReviewsForProduct(@RequestParam("productId") String productId) {
        List<Review> reviewsForProduct = reviewService.getReviewsForProduct(productId);
        return ResponseEntity.ok(reviewsForProduct);
    }
}