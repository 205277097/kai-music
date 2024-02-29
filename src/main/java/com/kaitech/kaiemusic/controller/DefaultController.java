package com.kaitech.kaiemusic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class DefaultController {
//    get请求后缀都是hello入口的都会返回hello word 如@GetMapping("say") 则要在后面加上/say
    @GetMapping
    public String sayHello() {
        return "hello word";
    }
}
