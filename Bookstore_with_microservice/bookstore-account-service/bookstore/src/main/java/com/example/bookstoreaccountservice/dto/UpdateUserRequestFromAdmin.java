package com.example.bookstoreaccountservice.dto;

import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateUserRequestFromAdmin {

    @Size(max = 40, message = "First Name length should not be grater than 40 characters")
    private String firstName;

    private String lastName;

    @Size(max = 40, message = "email length should not be grater than 40 characters")
    @Email
    private String email;

    private List<String> roles = new ArrayList<>();
}
