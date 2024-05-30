package com.atjerry.study.memory;

/**
 * @BelongsProject: Demo
 * @BelongsPackage: com.atjerry.study.memory
 * @Author: Jerry
 * @CreateTime: 2024-05-22  22:07
 * @Description: TODO
 * @Version: 1.0
 */

public class Person {

    //属性
    String name;
    int age;
    char gender;

    //方法

    public void eat() {
        System.out.println("人吃饭");
    }

    public void sleep() {
        System.out.println("人睡觉");
    }

    public void info() {
        System.out.println("name=" + name + "," + "age=" + age + "," + "gender=" + gender);
    }
}
