package com.herbalife.moreonjpa.exception;

import org.springframework.dao.DataAccessException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(DataAccessException.class)
    public String handleDataException(DataAccessException ex, WebRequest webRequest) {
        String message = "Error: " + ex.getRootCause().getMessage();
        return message;
    }
}
