package com.herbalife.springbootutapp.labs.lab05.controller;

import com.herbalife.springbootutapp.labs.lab05.dto.CalcInput;
import com.herbalife.springbootutapp.labs.lab05.dto.MathResult;
import com.herbalife.springbootutapp.labs.lab05.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/calc")
public class CalcController {
    @Autowired
    private CalculatorService calculatorService;

    @PostMapping("/add")
    public MathResult add(@RequestBody CalcInput calcInput) {
        return calculatorService.add(calcInput.getNumber1(), calcInput.getNumber2());
    }

    @PutMapping("/square/{num}")
    public int square(@PathVariable int num) {
        return calculatorService.square(num);
    }

    @PostMapping("/product")
    public int multiply(@RequestParam int num1, @RequestParam int num2) {
        return calculatorService.multiply(num1, num2);
    }

    @GetMapping("/operations")
    public List<String> calcOperations() {
        return calculatorService.getCalcOperations();
    }
}
