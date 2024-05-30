package com.atjerry.study.example.exer1;

/**
 * @BelongsProject: Demo
 * @BelongsPackage: com.atjerry.study.example.exer
 * @Author: Jerry
 * @CreateTime: 2024-05-26  16:50
 * @Description: TODO
 * @Version: 1.0
 */

public class PersonTest {
    public static void main(String[] args) {

        Person p1 = new Person();
        //调用属性
        p1.name = "蔡博文";
        p1.age = 25;
        p1.gender = '男';

        p1.Study();

        p1.addAge(2);

        int age = p1.showAge();
        System.out.println("age = " + age);

        Person p2 = new Person();

        System.out.println(p2.age);//0

        p2.addAge(10);

        //谁调就是谁的
        System.out.println(p2.showAge());//10

        System.out.println(p1.showAge());//27
    }
}
