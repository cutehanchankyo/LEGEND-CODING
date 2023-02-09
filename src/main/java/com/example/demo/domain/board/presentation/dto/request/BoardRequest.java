package com.example.demo.domain.board.presentation.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Getter
@NoArgsConstructor
@AllArgsConstructor
public class BoardRequest {

    private Long seq;
    private String name;
    private String title;
    private String content;
}
