package com.atjerry.study.constructor.exer1;

/**
 * @BelongsProject: Demo
 * @BelongsPackage: com.atjerry.study.constructor.exer1
 * @Author: Jerry
 * @CreateTime: 2024-06-01  22:17
 * @Description: TODO
 * @Version: 1.0
 */

public class Student {

    String name;
    int age;
    String school;
    String major;

    public void Student(String n,int a){
        name = n;
        age = a;
    }


     Student(String n,int a,String s){
        name = n;
        age = a;
        school = s;
    }

    Student(String n,int a,String s,String m){
        name = n;
        age = a;
        school = s;
        major = m;
    }

    public String getInfo(){
        return "name = " + name + ",age = " + age + ",school = " + school + ",major = " + major;
    }
}
