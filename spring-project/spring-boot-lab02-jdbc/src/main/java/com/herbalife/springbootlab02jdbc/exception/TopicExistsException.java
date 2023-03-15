package com.herbalife.springbootlab02jdbc.exception;

public class TopicExistsException extends RuntimeException {
    public TopicExistsException(String message) {
        super(message);
    }
}
