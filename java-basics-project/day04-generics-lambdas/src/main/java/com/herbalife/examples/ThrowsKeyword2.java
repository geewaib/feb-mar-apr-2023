package com.herbalife.examples;

public class ThrowsKeyword2 {
    public static void main(String[] args) throws Exception {
        int num = (int)(Math.random() * 10);
        if(num > 5) {
            throw new Exception("Number cannot be gt 5");
        }
        if(num == 5) {
            throw new Exception("Number cannot be 5");
        }
        doSomething();
    }

    static void doSomething() throws CustomException {
        int num = (int)(Math.random() * 10);
        if(num > 5) {
            throw new CustomException("Number cannot be gt 5");
        }
        if(num == 5) {
            throw new CustomRuntimeException("Number cannot be 5");
        }
    }
}

class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

class CustomRuntimeException extends RuntimeException {
    public CustomRuntimeException(String message) {
        super(message);
    }
}
