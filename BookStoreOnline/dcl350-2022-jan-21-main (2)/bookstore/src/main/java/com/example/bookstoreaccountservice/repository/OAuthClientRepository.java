package com.example.bookstoreaccountservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bookstoreaccountservice.entity.OAuthClient;


public interface OAuthClientRepository extends JpaRepository <OAuthClient, Long> {

}
