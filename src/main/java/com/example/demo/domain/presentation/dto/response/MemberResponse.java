package com.example.demo.domain.presentation.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;



@Getter
@AllArgsConstructor
public class MemberResponse {

    private Long seq;
    private String name;
    private String title;
    private String content;
}
