package com.atjerry.study.method.exer;

/**
 * @BelongsProject: Demo
 * @BelongsPackage: com.atjerry.study.method.exer
 * @Author: Jerry
 * @CreateTime: 2024-05-26  16:10
 * @Description: TODO
 * @Version: 1.0
 */

public class Employee {

    //属性(成员变量)

    int id;//编号

    String name;//姓名

    int age;//年龄

    double salary;//薪资

    public void show() {
        System.out.println("编号为:" + id + "姓名为" + name + "年龄为:" + age + "薪资为:" + salary);
    }
}
