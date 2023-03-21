package com.herbalife.springbootrestapilab06.dto;

import lombok.Data;

@Data
public class ErrorResponse {
    private String reason;
    private String timestamp;
    private String path;
}
