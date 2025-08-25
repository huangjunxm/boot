package com.shuijing.boot;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
//@Api(tags = "RESTFul接口")
public class RestFulController {

    @GetMapping("/swagger")
//    @ApiOperation(value = "Swagger接口")
    public String swagger() {
        return "Swagger Method";
    }
}
