package com.herbalife.restapibasicsday13.labs.lab05.service;

import com.herbalife.restapibasicsday13.labs.lab05.domain.Calculator;
import com.herbalife.restapibasicsday13.labs.lab05.dto.MathResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class CalculatorService {

    @Autowired
    private Calculator calculator;

    public MathResult add(int a, int b) {
        MathResult mathResult = new MathResult();
        mathResult.setNumber1(a);
        mathResult.setNumber2(b);
        mathResult.setOperation("Sum");
        mathResult.setResult(calculator.add(a, b));
        return mathResult;
    }

    public int multiply(int a, int b) {
        return calculator.multiply(a, b);
    }

    public int square(int a) {
        return calculator.square(a);
    }

    public List<String> getCalcOperations() {
        return Arrays.asList("Sum", "Square", "Product");
    }
}
