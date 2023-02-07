package com.example.demo.domain.board.presentation.dto.response;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class BoardResponse {
    private Long seq;
    private String name;
    private String title;
    private String content;
}
