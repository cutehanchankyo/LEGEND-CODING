package com.example.demo.domain.user.presentation.dto.request;

import com.example.demo.domain.user.entity.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UserRequest {
    private Long id;
    private String name;
    private String email;
    private String password;

    public User toEntity(){
        return User.builder()
                .id(id)
                .name(email)
                .password(password)
                .name(name)
                .build();
    }
}
