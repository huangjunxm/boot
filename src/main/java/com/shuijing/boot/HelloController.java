package com.shuijing.boot;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@Slf4j
public class HelloController {
    @GetMapping("/hello")
    public String hello(){
        log.info("hello");
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

    @GetMapping("/pathvariable/{name}/{age}")
    public User pathVariable(@PathVariable String name, @PathVariable Integer age){
        User user = new User();
        user.setName(name);
        user.setAge(age);
        return user;
    }

    @PostMapping("/requestbody")
    public User requestBody(@RequestBody @Valid User user){
        return user;
    }

}
