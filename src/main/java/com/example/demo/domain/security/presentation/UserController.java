package com.example.demo.domain.security.presentation;

import com.example.demo.domain.security.presentation.dto.request.UserRequest;
import com.example.demo.domain.security.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    //회원가입
    @PostMapping("/signup")
    public String signUp(UserRequest userRequest){
        if(userService.save(userRequest)){
            return "redirect:/login";
        }
        return "redirect:/signup?error";
    }
}
