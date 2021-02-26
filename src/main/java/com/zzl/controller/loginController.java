package com.zzl.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class loginController {

    @RequestMapping("/")
    public String home() {
        return "Hello, Zbook!";
    }
}
