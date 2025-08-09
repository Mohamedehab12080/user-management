package com.management.user.management.controller;

import com.management.api.AuthenticationApi;
import com.management.model.LoginRequest;
import com.management.model.UserRegistrationRequest;
import com.management.model.UserResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController implements AuthenticationApi {

    @Override
    public ResponseEntity<String> authLoginPost(LoginRequest loginRequest) {

        return ResponseEntity.ok("Login Successful");
    }

    @Override
    public ResponseEntity<UserResponse> authRegisterPost(UserRegistrationRequest userRegistrationRequest) {
        return AuthenticationApi.super.authRegisterPost(userRegistrationRequest);
    }
}
