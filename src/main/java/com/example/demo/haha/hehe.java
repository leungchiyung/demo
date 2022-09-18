package com.example.demo.haha;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hehe")

public class hehe {
    @RequestMapping("/hehe")
    public String hehe() {
        return "heha!!!";
    }
}