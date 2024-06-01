package com.atjerry.study.constructor;

/**
 * @BelongsProject: Demo
 * @BelongsPackage: com.atjerry.study.constructor
 * @Author: Jerry
 * @CreateTime: 2024-06-01  20:18
 * @Description: TODO
 * @Version: 1.0
 */

public class Person {

    String name;
    int age;

    public void eat(){
        System.out.println("人吃饭");
    }

    public void sleep(int hour){
        System.out.println("每天睡觉" + hour + "小时");
    }
}
