package com.example.myfirstspringproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Sample")
public class SampleController {
    @GetMapping("/SayHello/{name}")
    public String SayHello(@PathVariable String name) {
        return "Hello " + name;
    }

    @GetMapping("/SayBye")
    public String SayBye() {
//        System.out.println("Bye World");
        return "Bye World";
    }
}
