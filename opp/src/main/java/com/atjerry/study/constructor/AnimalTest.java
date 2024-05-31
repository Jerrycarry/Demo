package com.atjerry.study.constructor;

/**
 * @BelongsProject: Demo
 * @BelongsPackage: com.atjerry.study.constructor
 * @Author: Jerry
 * @CreateTime: 2024-05-31  23:09
 * @Description: TODO
 * @Version: 1.0
 */

public class AnimalTest {
    public static void main(String[] args) {
        Animal animal1 = new Animal();

        animal1.name = "金蟾";
        animal1.legs = 4;

        System.out.println("动物姓名叫:" + animal1.name + ",有"+animal1.legs + "条腿");
        animal1.eat();
    }





}

class Animal{
    //属性
    String name;
    int legs;

    public void eat(){
        System.out.println("动物吃饭");
    }
}
