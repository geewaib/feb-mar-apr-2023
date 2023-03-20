package com.herbalife.restapibasicsday13;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

import java.time.Instant;

@RestControllerAdvice
public class AppExceptionHandler {
    @ExceptionHandler(MethodArgumentTypeMismatchException.class)
    public HttpEntity<ErrorResponse> handleMethodArgumentTypeMismatchException(MethodArgumentTypeMismatchException ex, WebRequest webRequest) {
        ErrorResponse errorResponse = new ErrorResponse();
        errorResponse.setReason(ex.getMessage());
        errorResponse.setTimestamp(Instant.now().toString());
        errorResponse.setPath(webRequest.getDescription(false));

        return new ResponseEntity<>(errorResponse, HttpStatus.NOT_ACCEPTABLE);
    }

    @ExceptionHandler(ArithmeticException.class)
    public HttpEntity<String> handleArithmeticException(ArithmeticException ex, WebRequest webRequest) {
        return new ResponseEntity<>("Error: " + ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
