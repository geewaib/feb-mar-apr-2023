package com.herbalife.labs.lab08;

import static com.herbalife.labs.lab08.ValidationConstants.*;

public class Lab08 {
    public static void main(String[] args) {
        String userName = "adminXY";
        boolean userNameValid = isNotNull
                .and(isNotEmpty)
                .and(isNotBlank)
                .and(lengthValidator.apply(6, 12))
                .test(userName);
        System.out.println(userNameValid);

        String password = "Sam12345";
        boolean passwordValid = isNotNull
                .and(isNotEmpty)
                .and(isNotBlank)
                .and(lengthValidator.apply(8, 14))
                .and(hasUpperCase)
                .and(hasDigit)
                .test(password);
        System.out.println(passwordValid);

    }
}
