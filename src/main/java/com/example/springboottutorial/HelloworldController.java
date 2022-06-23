package com.example.springboottutorial;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ResponseBody
public class HelloworldController {
    @RequestMapping("/hello")
    public String helloworld()
    {
        return "Hello from Spring boot";

    }
}
