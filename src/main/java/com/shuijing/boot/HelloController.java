package com.shuijing.boot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloController {
    @GetMapping("/hello")
    public String hello(){
        return "hello world";
    }

    @GetMapping("/noannotation")
    public User noAnnotation(User user){
        return user;
    }

    @GetMapping("/requestparam")
    public User requestParam(@RequestParam String name, @RequestParam Integer age){
        User user = new User();
        user.setName(name);
        user.setAge(age);
        return user;
    }
}
