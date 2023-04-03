package com.herbalife.springbootutapp.labs.lab05.service;

import com.herbalife.springbootutapp.labs.lab05.domain.Calculator;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;
@Disabled
@ExtendWith(SpringExtension.class)
public class CalculatorServiceTest {
    @MockBean
    private Calculator calculator;

    @InjectMocks
    private CalculatorService calculatorService;

    @Test
    public void setUpTest() {
        assertNotNull(calculatorService);
    }
}
