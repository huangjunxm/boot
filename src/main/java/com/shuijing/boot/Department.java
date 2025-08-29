package com.shuijing.boot;

public class Department {
    private String id;

    private String name;

    private String tel;
    @Override
    public String toString() {
        return "Department{" +
                "id='" + id + '\'' +  // 单引号包裹字符串类型的属性
                ", name='" + name + '\'' +
                ", tel='" + tel + '\'' +
                '}';  // 注意末尾的闭合符号
    }
}
