package com.atjerry.study.encapsolution.exer1;

/**
 * @BelongsProject: Demo
 * @BelongsPackage: com.atjerry.study.encapsolution.exer1
 * @Author: Jerry
 * @CreateTime: 2024-06-01  00:30
 * @Description: TODO
 * @Version: 1.0
 */

public class Person {

    private int age;

    public void setAge(int a){
        if (a >=0 && a <=130){
            age = a;
        }else {
            System.out.println("你输入的数据有误,请重新输入。");
        }
    }

    public int getAge(){
        return age;
    }
}
