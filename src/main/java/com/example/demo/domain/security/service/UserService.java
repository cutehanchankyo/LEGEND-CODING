package com.example.demo.domain.security.service;


import com.example.demo.domain.security.presentation.dto.request.UserRequest;

public interface UserService {
    public boolean save(UserRequest userRequest);
}
