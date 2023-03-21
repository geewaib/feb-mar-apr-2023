package com.herbalife.springbootrestapilab06.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.Size;

@Data
@Schema(description = "Information about topic")
public class TopicInput {
    @Size(min = 2, max = 40)
    @Schema(defaultValue = "Ruby on Rails")
    private String title;

    @Schema(defaultValue = "60")
    private int duration;
}
