package com.herbalife.springbootrestapilab06.exception;

import com.herbalife.springbootrestapilab06.constants.MessageConstants;
import com.herbalife.springbootrestapilab06.dto.ErrorResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import javax.validation.ConstraintViolationException;
import java.time.Instant;

@RestControllerAdvice
@Slf4j
public class AppExceptionHandler {

    @ExceptionHandler(ConstraintViolationException.class)
    public HttpEntity<ErrorResponse> handleConstraintViolationException(ConstraintViolationException ex, WebRequest webRequest) {
        String message = ex.getMessage();
        log.error(message);
        ErrorResponse errorResponse = createErrorResponse(message, webRequest);
        return new ResponseEntity<>(errorResponse, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(TopicNotFoundException.class)
    public HttpEntity<ErrorResponse> handleTopicNotFoundException(TopicNotFoundException ex, WebRequest webRequest) {
        String message = String.format(MessageConstants.TOPIC_NOT_FOUND, ex.getMessage());
        log.error(message);
        ErrorResponse errorResponse = createErrorResponse(message, webRequest);
        return new ResponseEntity<>(errorResponse, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(TopicAlreadyExistsException.class)
    public HttpEntity<ErrorResponse> handleTopicAlreadyExistsException(TopicAlreadyExistsException ex, WebRequest webRequest) {
        String message = String.format(MessageConstants.TOPIC_EXISTS, ex.getMessage());
        log.error(message);
        ErrorResponse errorResponse = createErrorResponse(message, webRequest);
        return new ResponseEntity<>(errorResponse, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    private ErrorResponse createErrorResponse(String ex, WebRequest webRequest) {
        ErrorResponse errorResponse = new ErrorResponse();
        errorResponse.setReason(ex);
        errorResponse.setTimestamp(Instant.now().toString());
        errorResponse.setPath(webRequest.getDescription(false));
        return errorResponse;
    }

}
