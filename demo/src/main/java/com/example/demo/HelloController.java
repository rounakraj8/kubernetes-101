package com.example.demo;

import org.springframework.util.*;
import org.springframework.web.bind.annotation.*;


@RestController public class HelloController {

    @GetMapping(value = "/hello/{userName}")
    public String hello(@PathVariable(required = false) String userName) {
        System.out.println("Request for -> "+userName);
        return "Hello! " +
                (StringUtils.isEmpty(userName) ? "Stranger" : StringUtils.capitalize(userName));
    }

}
