package com.atjerry.study.encapsolution.exer3;

import java.util.Scanner;

/**
 * @BelongsProject: Demo
 * @BelongsPackage: com.atjerry.study.encapsolution.exer3
 * @Author: Jerry
 * @CreateTime: 2024-06-01  01:34
 * @Description: TODO
 * @Version: 1.0
 */

public class EmployeeTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Employee[] employee = new Employee[2];

        for (int i = 0; i < employee.length; i++) {
            employee[i] = new Employee();

            System.out.println("-------------添加" + (i+1) + "个员工--------------");
            System.out.print("姓名:");
            String name = scanner.next();
            System.out.print("性别:");
            char gender = scanner.next().charAt(0);
            System.out.print("年龄:");
            int age = scanner.nextInt();
            System.out.print("电话");
            String phoneNumber = scanner.next();


            //给指定的employee对象的个属性赋值
            employee[i].setName(name);
            employee[i].setGender(gender);
            employee[i].setAge(age);
            employee[i].setTelephone(phoneNumber);
        }

        //遍历员工列表
        System.out.println("--------------员工列表---------------");
        System.out.println("编号\t姓名\t性别\t年龄\t电话\t");
        for (int i = 0; i < employee.length; i++) {
            System.out.println((i+1) + "\t" + employee[i].getInfo());
        }
        System.out.println("--------------员工列表完成---------------");

    }
}
