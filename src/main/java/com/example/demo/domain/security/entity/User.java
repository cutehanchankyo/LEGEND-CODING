package com.example.demo.domain.security.entity;

import com.mysql.cj.conf.StringProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@Entity
@AllArgsConstructor     // 파라미터가 없는 기본 생성자를 생성해준다

public class User {
    @Id     // PK 기본키 지정
    @GeneratedValue(strategy = GenerationType.IDENTITY)     //PK 전략 방식 Identity 방식을 사용하면 자동으로 기본키 값이 증가한다
    private Long id;

    @Column(length = 100, nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String password;

    @Column(length = 30, nullable = false)
    private String name;

    private String phone;

    private String title;

    private String website;

    private String profileImgUrl;


    @Builder
    public User(String email, String password, String name, String phone ,String title, String website, String profileImgUrl){
        this.email = email;
        this.password = password;
        this.name = name;
        this.phone = phone;
        this.title = title;
        this.website = website;
        this.profileImgUrl = profileImgUrl;
    }


}
