package com.herbalife.springbootmorebasicsday11;

import org.springframework.stereotype.Component;

@Component
public class SoundAlarm implements Alarm {
    @Override
    public void activate() {
        System.out.println("Sound alarm activated");
    }

    @Override
    public void deactivate() {
        System.out.println("Sound alarm deactivated");
    }
}
