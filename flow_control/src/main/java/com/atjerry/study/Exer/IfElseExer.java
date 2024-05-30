package com.atjerry.study.Exer;

/**
 * @BelongsProject: Demo
 * @BelongsPackage: com.atjerry.study.Exer
 * @Author: Jerry
 * @CreateTime: 2024-05-14  23:17
 * @Description: TODO
 * @Version: 1.0
 */

/*
 * if-else的循环嵌套
 * 案例:由键盘输入三个整数分别存入变量num1、num2、num3,对它们进行排序（使用if-else if-else),并且从小到大输出。
 * */
public class IfElseExer {
    public static void main(String[] args) {
        int num1 = 31, num2 = 40, num3 = 23;

        if (num1 >= num2) {
            if (num3 >= num1) {
                System.out.println(num3 + "," + num1 + "," + num2);
            } else if (num3 <= num2) {
                System.out.println(num1 + "," + num2 + "," + num3);
            } else {
                System.out.println(num2 + "," + num3 + "," + num1);
            }
        } else {//num1 <= num2
            if (num3 >= num2) {
                System.out.println(num1 + "," + num2 + "," + num3);
            } else if (num3 <= num1) {
                System.out.println(num3 + "," + num1 + "," + num2);
            } else {
                System.out.println(num1 + "," + num3 + "," + num2);
            }
        }
    }
}
