package com.herbalife.springbootlab03jpa.exception;

public class TopicExistsException extends RuntimeException {
    public TopicExistsException(String message) {
        super(message);
    }
}
