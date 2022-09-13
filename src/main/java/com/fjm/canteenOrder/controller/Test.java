package com.fjm.canteenOrder.controller;

import com.fjm.canteenOrder.entity.Result;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class Test {

    @GetMapping("/hello")
    public Object hello() {
        return Result.success("hello");
    }

    @PostMapping("/post")
    public Object hello2(@RequestBody Object obj) {
        return Result.success("hello");
    }
}
