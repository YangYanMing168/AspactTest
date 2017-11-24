package com.app.controler;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControler {

    @RequestMapping("/hello")
    public String Hello() {
        return "Hello";
    }
    @RequestMapping("/other")
    public String other(){
        return "Other";
    }
}
