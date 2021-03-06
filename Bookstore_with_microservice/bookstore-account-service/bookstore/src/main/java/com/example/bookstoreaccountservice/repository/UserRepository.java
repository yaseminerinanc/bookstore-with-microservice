package com.example.bookstoreaccountservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.bookstoreaccountservice.entity.User;

import java.util.Optional;

import javax.transaction.Transactional;

@Transactional
public interface UserRepository extends JpaRepository<User, Long> {

  Optional<User> findByUserName(String username);

  Optional<User> findByUserNameOrEmail(String uName, String eMail);

  Optional<User> findByUserId(String userId);

  void deleteByUserId(String userId);

  Boolean existsByUserName(String userName);

  Boolean existsByEmail(String email);

}
