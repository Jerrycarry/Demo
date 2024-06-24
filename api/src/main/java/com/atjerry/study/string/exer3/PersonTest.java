package com.atjerry.study.string.exer3;

import java.util.Scanner;

/**
 * @BelongsProject: Demo
 * @BelongsPackage: com.atjerry.study.string.exer3
 * @Author: Jerry
 * @CreateTime: 2024-06-25  00:34
 * @Description:
 * @Version: 1.0
 */

public class PersonTest {

    public static void main(String[] args) {
        //1.创建数组，并初始化几个Person对象
        Person[] people = new Person[3];
        people[0] = new Person("Tom", "8888");
        people[1] = new Person("张三", "9999");
        people[2] = new Person("李四", "55555");

        System.out.println("库中的用户有:");
        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i]);
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String personName = scanner.next();
        System.out.println("请输入密码：");
        String personPassWord = scanner.next();

        boolean isFlag = true;
        for (int i = 0; i < people.length; i++) {
            if (people[i].getName().equals(personName)) {//存在此用户
                isFlag = false;
                if (people[i].getPassword().equals(personPassWord)) {
                    System.out.println("登录成功" + personName);
                } else {
                    System.out.println("不好意思,用户密码输入错误。");
                }
                break;
            }
        }
        if (isFlag) {
            System.out.println("不好意思,该用户不存在");
        }
        scanner.close();
    }
}
