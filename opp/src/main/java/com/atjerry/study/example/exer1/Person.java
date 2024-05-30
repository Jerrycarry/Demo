package com.atjerry.study.example.exer1;

/**
 * @BelongsProject: Demo
 * @BelongsPackage: com.atjerry.study.example.exer
 * @Author: Jerry
 * @CreateTime: 2024-05-26  16:44
 * @Description: TODO
 * @Version: 1.0
 */

public class Person {

    String name;//姓名

    int age;//年龄

    char gender;//性别

    public void Study(){
        System.out.println("studying");
    }

    public int showAge(){
        return age;
    }

    public void addAge(int addAge){
        age +=addAge;
    }

    public String info(){

        return "name=" + name  +
                ", age=" + age +
                ", gender=" + gender;
    }

}
