package com.springboottest2.springboottest2;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class Controller {

    @GetMapping("/api/string")
    public String getString() {
        return "Hello World!";
    }
    
    @GetMapping("/error")
    public String getError() {
        return "Error";
    }
}
