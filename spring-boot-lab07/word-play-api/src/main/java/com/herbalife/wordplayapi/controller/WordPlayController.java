package com.herbalife.wordplayapi.controller;

import com.herbalife.wordplayapi.service.WordPlayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WordPlayController {
    @Autowired
    private WordPlayService wordPlayService;

    @GetMapping("/wordplay/{word}")
    public String isPalindrome(@PathVariable String word) {
        String output = "%s is %s palindrome";
        boolean response = wordPlayService.checkPalindrome(word);
        if(response) {
            return String.format(output, word, "a");
        } else {
            return String.format(output, word, "not a");
        }
    }
}
