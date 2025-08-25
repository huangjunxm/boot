package com.shuijing.boot;



import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import javax.validation.constraints.*;
import java.time.LocalDate;

@Data
@Schema(description = "用户信息描述类")
public class User {
    @NotBlank(message="名字不能为空")
    @Schema(description = "姓名",example = "王二狗")
    private String name;

    @Min(value=1,message = "年龄不能小于1")
//    @ApiModelProperty("年龄")
    private int age;

//    @ApiModelProperty("邮件")
    @Email(message = "Email格式不正确")
    private String email;

//    @ApiModelProperty("生日")
    @Past(message = "生日必须为过去时间")
    private LocalDate birthday;
}
