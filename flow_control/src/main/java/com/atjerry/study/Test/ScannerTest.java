package com.atjerry.study.Test;

import java.util.Scanner;

/**
 * @BelongsProject: Demo
 * @BelongsPackage: com.atjerry.study.Test
 * @Author: Jerry
 * @CreateTime: 2024-05-14  23:35
 * @Description: TODO
 * @Version: 1.0
 */

/*
* 1.使用Scanner获取不同数据类型的步骤
* 2.案例：小明注册某交友网站，要求录入个人相关信息。如下：
请输入你的网名、你的年龄、你的体重、你是否单身、你的性别等情况。
* */
public class ScannerTest {
    public static void main(String[] args) {
        //提供一个Scanner类的实例;
        Scanner scanner = new Scanner(System.in);
        //调用Scanner类中的方法,获取指定数据类型的变量
        String name = scanner.next();

        int age = scanner.nextInt();
        int weight = scanner.nextInt();
        boolean sign = scanner.nextBoolean();
        String gender = scanner.next();
        System.out.println("name = " + name + ",年龄 = " + age + ",weight" + weight + ",sign = " + sign + ",gender = " + gender);
        scanner.close();
    }
}
