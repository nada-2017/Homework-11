package com.example.test.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/get")//URL
public class HelloController {

    @GetMapping(path = "/name")//Path
    public String name(){
        return "My name is ....";
    }
    @GetMapping(path = "/age")
    public String age(){
        return "My age is ....";
    }
    @GetMapping(path = "/check/status")
    public String check(){
        return "Everything OK";
    }
    @GetMapping(path = "/health")
    public String health(){
        return "Server health is up and running";
    }
}
