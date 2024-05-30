package com.atjerry.study.example.exer2;

/**
 * @BelongsProject: Demo
 * @BelongsPackage: com.atjerry.study.example.exe2
 * @Author: Jerry
 * @CreateTime: 2024-05-26  17:30
 * @Description: TODO
 * @Version: 1.0
 */

public class Exer02Test {
    public static void main(String[] args) {
        Exer02 exer02 = new Exer02();
        exer02.method1();

        System.out.println("---------------------");
        int area02 = exer02.method2();
        System.out.println("method02的面积为:" + area02);

        int area03 = exer02.method3(3,4);
        System.out.println("method03的面积为:" + area03);

    }
}
