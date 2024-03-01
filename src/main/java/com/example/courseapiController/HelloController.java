package com.example.courseapiController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController   //Annotation to mark this class as a Rest Controller which means you can have requests in this class mapped to methods
public class HelloController {

    @RequestMapping("/hello") //requestMapping helps to map and return sayHi() to "/hello" request
    public String SayHi()
    {
        return "Hey there";
    }
}
