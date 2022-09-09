package com.fjm.canteenOrder.controller;

import com.fjm.canteenOrder.entity.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class Test {

    @GetMapping("/hello")
    public Object hello() {
        return Result.success("hello");
    }
}
