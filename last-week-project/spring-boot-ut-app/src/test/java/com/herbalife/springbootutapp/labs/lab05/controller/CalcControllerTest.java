package com.herbalife.springbootutapp.labs.lab05.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.herbalife.springbootutapp.labs.lab05.dto.CalcInput;
import com.herbalife.springbootutapp.labs.lab05.dto.MathResult;
import com.herbalife.springbootutapp.labs.lab05.service.CalculatorService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@WebMvcTest(CalcController.class)
public class CalcControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private CalculatorService calculatorService;

    @Test
    public void setUpTest() {
        assertNotNull(calculatorService);
    }

    @Test
    public void multiplication() throws Exception {
        when(calculatorService.multiply(12, 12)).thenReturn(144);
        mockMvc
                .perform(post("/calc/product")
                        .param("num1", "12")
                        .param("num2", "12"))
                .andExpect(content().string("144"));
        verify(calculatorService, times(1)).multiply(12, 12);
    }

    @Test
    public void addition() throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();
        MathResult mathResult = new MathResult();
        mathResult.setNumber1(12);
        mathResult.setNumber2(12);
        mathResult.setOperation("Sum");
        mathResult.setResult(24);
        String jsonOutput = objectMapper.writeValueAsString(mathResult);

        CalcInput calcInput = new CalcInput();
        calcInput.setNumber1(12);
        calcInput.setNumber2(12);
        String jsonInput = objectMapper.writeValueAsString(calcInput);

        when(calculatorService.add(12, 12)).thenReturn(mathResult);
        mockMvc.perform(
                        post("/calc/add")
                                .contentType(MediaType.APPLICATION_JSON)
                                .content(jsonInput))
                .andExpect(content().string(jsonOutput));
    }

}
