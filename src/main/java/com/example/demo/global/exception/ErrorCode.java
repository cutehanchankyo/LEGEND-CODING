package com.example.demo.global.exception;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum ErrorCode {
    // ***Member***
    MEMBER_ALREADY(HttpStatus.CONFLICT, "이미가입된 유저이다."),
    NONE_MEMBER(HttpStatus.NOT_FOUND, "존재하지 않는 유저이다."),
    ;

    private final HttpStatus httpStatus;
    private  String message;
}
