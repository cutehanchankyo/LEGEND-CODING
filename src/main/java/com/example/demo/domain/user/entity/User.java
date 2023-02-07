package com.example.demo.domain.user.entity;

import com.example.demo.domain.user.presentation.dto.UserUpdateDto;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "password")
    private String password;

    @Column(name = "email")
    private String email;

    public void update(UserUpdateDto userUpdateDto){
        this.id = userUpdateDto.getId();
        this.name = userUpdateDto.getName();
        this.password = userUpdateDto.getEmail();
        this.email = userUpdateDto.getEmail();
    }
}
