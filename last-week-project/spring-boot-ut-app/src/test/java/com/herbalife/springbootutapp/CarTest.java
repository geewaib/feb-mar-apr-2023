package com.herbalife.springbootutapp;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;

@Disabled
@SpringBootTest
@ActiveProfiles("qa")
public class CarTest {
    @Autowired
    private Car car;

    @Test
    public void carIsNotNull() {
        assertNotNull(car);
    }

    @Test
    public void checkCarModel() {
        assertEquals(car.getModel(), "Ferrari");
    }
}
