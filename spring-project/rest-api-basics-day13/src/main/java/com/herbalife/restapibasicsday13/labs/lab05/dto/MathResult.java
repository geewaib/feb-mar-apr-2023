package com.herbalife.restapibasicsday13.labs.lab05.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MathResult {
    @JsonProperty("num1")
    private int number1;

    @JsonProperty("num2")
    private int number2;

    private String operation;
    private int result;

    public int getNumber1() {
        return number1;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public int getNumber2() {
        return number2;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }
}
