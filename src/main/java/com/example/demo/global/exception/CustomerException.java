package com.example.demo.global.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class CustomerException extends RuntimeException{
    private ErrorCode errorCode;
}
