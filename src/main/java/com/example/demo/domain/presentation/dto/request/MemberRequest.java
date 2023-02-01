package com.example.demo.domain.presentation.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;


@Getter
@Builder
@AllArgsConstructor
public class MemberRequest {

    private Long seq;
    private String name;
    private String title;
    private String content;
}
