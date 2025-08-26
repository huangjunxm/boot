package com.shuijing.boot;



import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Past;
import lombok.Data;


import java.time.LocalDate;

@Data
@Entity
@Table(indexes = {@Index(name = "uk_email",columnList = "email",unique = true)})
@Schema(description = "用户信息描述类")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, columnDefinition = "varchar(20) comment '姓名'")
    @NotBlank(message="名字不能为空")
    @Schema(description = "姓名",example = "王二狗")
    private String name;

//    @Transient
    @Min(value=1,message = "年龄不能小于1")
    @Schema(description = "年龄")
    private int age;

    @Column(nullable = false,length = 50)
    @Email(message = "Email格式不正确")
    @Schema(description = "电子邮件")
    private String email;

    @Schema(description = "生日")
    @Past(message = "生日必须为过去时间")
    private LocalDate birthday;
}
