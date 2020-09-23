package com.wusd.httpsdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
    @RequestMapping("/getHelloWorld")
    public String getHelloWorld() {
        return "hello world!";
    }
}
