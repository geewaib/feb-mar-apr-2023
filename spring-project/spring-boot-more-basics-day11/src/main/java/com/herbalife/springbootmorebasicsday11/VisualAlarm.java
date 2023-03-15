package com.herbalife.springbootmorebasicsday11;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class VisualAlarm implements Alarm {
    @Override
    public void activate() {
        System.out.println("Visual alarm activated");
    }

    @Override
    public void deactivate() {
        System.out.println("Visual alarm deactivated");
    }
}
