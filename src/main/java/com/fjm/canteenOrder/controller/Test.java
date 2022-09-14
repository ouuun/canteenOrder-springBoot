package com.fjm.canteenOrder.controller;

import com.fjm.canteenOrder.convert.UserConvert;
import com.fjm.canteenOrder.entity.DTO.UserDTO;
import com.fjm.canteenOrder.entity.Result;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/test")
@Validated
public class Test {

    @GetMapping("/hello")
    public Object hello() {
        return Result.success("hello");
    }

    @PostMapping("/post")
    public Object hello2(@RequestBody Object obj) {
        return Result.success("hello");
    }

    @PostMapping("/post2")
    public Object hello3(@RequestBody @Valid UserDTO userDTO2) {

        UserDTO userDTO = new UserDTO();
        userDTO.setName("test");
        userDTO.setId(1l);

        return Result.success(UserConvert.INSTANCE.userDTOToUserDO(userDTO2));
    }
}
