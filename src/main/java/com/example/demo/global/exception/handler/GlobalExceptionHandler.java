package com.example.demo.global.exception.handler;

import com.example.demo.global.exception.CustomerException;
import com.example.demo.global.exception.ErrorResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
@Order(Ordered.HIGHEST_PRECEDENCE)
public class GlobalExceptionHandler {

    @ExceptionHandler(CustomerException.class)
    public ResponseEntity<ErrorResponse> handleConflict(CustomerException e){
        ErrorResponse build = new ErrorResponse(e.getErrorCode().getHttpStatus().value(),e.getErrorCode().getMessage());

        return new ResponseEntity<>(build, e.getErrorCode().getHttpStatus());
    }

}
