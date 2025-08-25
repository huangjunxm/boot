package com.shuijing.boot;



import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@Slf4j
@Tag(name = "Hello控制器",description = "展现几种不同的参数调用方案")
public class HelloController {
    @GetMapping("/hello")
    @Operation(summary = "无参仅显示Hello World",description = "没有参数")
    public String hello(){
        log.info("hello");
        return "hello world";
    }

    @GetMapping("/noannotation")
    public User noAnnotation(User user){
        return user;
    }

    @GetMapping("/requestparam")
    @Operation(summary = "Url直接带参数接口")
    @Parameters(value = {
            @Parameter(name = "name",description = "用户名",example = "王二狗"),
            @Parameter(name = "age" ,description = "用户年龄",example = "28")
    })
    public User requestParam(@RequestParam String name, @RequestParam Integer age){
        User user = new User();
        user.setName(name);
        user.setAge(age);
        return user;
    }

    @GetMapping("/pathvariable/{name}/{age}")
//    @ApiOperation(value = "目录型调用接口")
    public User pathVariable(@Parameter(description = "用户名") @PathVariable String name, @Parameter(description = "用户年龄") @PathVariable Integer age){
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
