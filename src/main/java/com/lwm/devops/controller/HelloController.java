package com.lwm.devops.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 * @create 2021-04-18 17:41
 */
@RestController
public class HelloController {

    @GetMapping("hello")
    public String hello(){
        return "Hello Java DevOps!";
    }
}
