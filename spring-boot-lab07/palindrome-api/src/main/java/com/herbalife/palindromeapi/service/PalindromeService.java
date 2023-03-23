package com.herbalife.palindromeapi.service;

import org.springframework.stereotype.Service;

@Service
public class PalindromeService {

    public boolean isPalindrome(String word) {
        StringBuilder stringBuilder = new StringBuilder(word);
        String reversedWord = stringBuilder.reverse().toString();
        return word.equalsIgnoreCase(reversedWord);
    }
}
