//package com.shuijing.boot;
//
//
//import com.baomidou.mybatisplus.annotation.FieldFill;
//import com.baomidou.mybatisplus.annotation.IdType;
//import com.baomidou.mybatisplus.annotation.TableField;
//import com.baomidou.mybatisplus.annotation.TableId;
//import com.baomidou.mybatisplus.extension.activerecord.*;
//import io.swagger.v3.oas.annotations.tags.Tag;
//import lombok.Data;
//import lombok.EqualsAndHashCode;
//
//import java.time.LocalDateTime;
//
//@Data
//@EqualsAndHashCode(callSuper = false)
//@Tag(name = "实体基类",description = "该类下都是实体类所必备的公共字段，比如'id'，比如审计字段等")
//public abstract class BaseEntity<T extends Model<T>> extends Model<T> {
//
//    @TableId(value = "id",type = IdType.AUTO)
//    private  Integer id;
//
//    @TableField(fill = FieldFill.INSERT)
//    private String creator;
//
//    @TableField(fill = FieldFill.INSERT)
//    private LocalDateTime createTime;
//
//    @TableField(fill = FieldFill.INSERT_UPDATE)
//    private String modifier;
//
//    @TableField(fill = FieldFill.INSERT_UPDATE)
//    private LocalDateTime updateTime;
//}
