package com.atjerry.study.example.exer3;

/**
 * @BelongsProject: Demo
 * @BelongsPackage: com.atjerry.study.example.exer3
 * @Author: Jerry
 * @CreateTime: 2024-05-26  17:53
 * @Description: TODO
 * @Version: 1.0
 */

public class CircleTest {

    public static void main(String[] args){
        Circle c1 = new Circle();
        c1.radius = 3;

        c1.findArea();
        /*错误方法
        Circle c2 = new Circle();
        c2.findArea1(99);*/
    }
}
