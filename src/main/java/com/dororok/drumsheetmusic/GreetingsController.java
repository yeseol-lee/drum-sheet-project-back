package com.dororok.drumsheetmusic;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsController {
    @GetMapping("/hello")
    public String sayHello() {
        return "hello";
    }

    @GetMapping("/test")
    public String test() {
        System.out.println("=======================");
        System.out.println("/test api is requested");
        System.out.println("=======================");
        return "hello";
    }


}
