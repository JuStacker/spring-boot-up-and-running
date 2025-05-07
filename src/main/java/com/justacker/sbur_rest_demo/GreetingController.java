package com.justacker.sbur_rest_demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greeting")
public class GreetingController {
    //@Value( "${greeting-name}")
    //private String name;

    //@Value("${greeting-coffee: ${greeting-name} is drinking Americano}")
    //private String coffee;

    private final Greeting greeting;

    public GreetingController(Greeting greeting) {
        this.greeting = greeting;
    }

    @GetMapping
    public String getName() {
        return this.greeting.getName();
    }
    @GetMapping("/coffee")
    public String getCoffee() {
        return this.greeting.getCoffee();
    }
}
