package com.sun.pushme.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class TestController {
    @RequestMapping("/test")
    private String test(){
        log.error("log: 测试内容");
        return "Hello World!";
    }
}
