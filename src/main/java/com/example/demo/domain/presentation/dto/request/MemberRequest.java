package com.example.demo.domain.presentation.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Getter
@NoArgsConstructor
@AllArgsConstructor
public class MemberRequest {

    private Long seq;
    private String name;
    private String title;
    private String content;
}
