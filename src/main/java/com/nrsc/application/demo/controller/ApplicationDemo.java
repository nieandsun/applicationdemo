package com.nrsc.application.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationDemo {

    @Value("${word}")
    private String word;

    @GetMapping("getWordFromApplication")
    public String getWordFromApplication() {
        return word;
    }
}
