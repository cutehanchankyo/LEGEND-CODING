package com.example.demo.domain.user.service;

import com.example.demo.domain.user.presentation.dto.UserDeleteDto;
import com.example.demo.domain.user.presentation.dto.UserDto;
import com.example.demo.domain.user.presentation.dto.UserUpdateDto;

public interface UserService {

    public void signup(UserDto userRequest);
    public void update(UserUpdateDto userUpdateDto);
    public void delete(UserDeleteDto userDeleteDto);
}
