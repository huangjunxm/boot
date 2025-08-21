package com.shuijing.boot;


import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Past;
import java.time.LocalDate;

@Data
public class User {
    @NotBlank(message="名字不能为空")
    private String name;
    @Min(value=1,message = "年龄不能小于1")
    private int age;
    @Email(message = "Email格式不正确")
    private String email;
    @Past(message = "生日必须为过去时间")
    private LocalDate birthday;
}
