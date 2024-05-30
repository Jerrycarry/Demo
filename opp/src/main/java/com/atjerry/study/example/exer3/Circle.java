package com.atjerry.study.example.exer3;

/**
 * @BelongsProject: Demo
 * @BelongsPackage: com.atjerry.study.example.exer3
 * @Author: Jerry
 * @CreateTime: 2024-05-26  17:44
 * @Description: TODO
 * @Version: 1.0
 */

public class Circle {

    double radius;//半径

    double PI = 3.14;//

    public void findArea() {
        System.out.println("面积为:" + PI * radius * radius);
    }

    /*错误地方法
    public void findArea1(double r) {
        System.out.println("面积为:" + r * r * PI);
    }*/
}
