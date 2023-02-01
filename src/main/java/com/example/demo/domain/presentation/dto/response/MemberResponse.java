package com.example.demo.domain.presentation.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Getter
@NoArgsConstructor
@AllArgsConstructor
public class MemberResponse {

    private Long seq;
    private String name;
    private String title;
    private String content;
}
