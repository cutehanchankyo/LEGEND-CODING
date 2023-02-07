package com.example.demo.domain.user.presentation;

import com.example.demo.domain.user.presentation.dto.UserDto;
import com.example.demo.domain.user.presentation.dto.UserUpdateDto;
import com.example.demo.domain.user.service.lmpI.UserServicelmpI;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {
    public UserServicelmpI userService;

    @PostMapping("/signup")
    public ResponseEntity<Void> signUp(@Valid UserDto userRequest){
        userService.signup(userRequest);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping
    public void update(@RequestBody UserUpdateDto userUpdateDto){
        userService.update(userUpdateDto);
    }



}
