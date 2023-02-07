package com.example.demo.domain.user.presentation;

import com.example.demo.domain.user.presentation.dto.request.UserRequest;
import com.example.demo.domain.user.service.UserService;
import com.example.demo.domain.user.service.lmpI.UserServicelmpI;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {
    public UserServicelmpI userService;

    @PostMapping("/signup")
    public ResponseEntity<Void> signUp(@Valid UserRequest userRequest){
        userService.signup(userRequest);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
