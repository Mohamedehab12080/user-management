package com.management.user.management.controller;

import com.management.api.UsersApi;
import com.management.model.UserResponse;
import com.management.model.UserUpdateRequest;
import com.management.model.UsersGet200Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class UsersContrller implements UsersApi {
    @Override
    public ResponseEntity<UsersGet200Response> usersGet(String gender, String fullName, Integer page, Integer size, String sort) {
        return UsersApi.super.usersGet(gender, fullName, page, size, sort);
    }

    @Override
    public ResponseEntity<Void> usersIdDelete(UUID id) {
        return UsersApi.super.usersIdDelete(id);
    }

    @Override
    public ResponseEntity<UserResponse> usersIdGet(UUID id) {
        return UsersApi.super.usersIdGet(id);
    }

    @Override
    public ResponseEntity<UserResponse> usersIdPut(UUID id, UserUpdateRequest userUpdateRequest) {
        return UsersApi.super.usersIdPut(id, userUpdateRequest);
    }


}
