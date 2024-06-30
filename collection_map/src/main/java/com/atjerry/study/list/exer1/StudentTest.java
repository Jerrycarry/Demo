package com.atjerry.study.list.exer1;



import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @BelongsProject: Demo
 * @BelongsPackage: com.atjerry.study.list.exer1
 * @Author: Jerry
 * @CreateTime: 2024-06-30  20:42
 * @Description: 测试类
 * @Version: 1.0
 */

public class StudentTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List list = new ArrayList<>();
        System.out.println("请录入学生信息");



        while(true){
            System.out.println("1:继续录入,0:结束录入");
            int selection = scanner.nextInt();

            if (selection == 0){
                break;
            }

            System.out.println("请输入学生的姓名：");
            String name = scanner.next();
            System.out.println("请输入学生的年龄：");
            int age = scanner.nextInt();

            Student student = new Student(name,age);
            list.add(student);
        }

        //遍历集合中的学生信息
        for (Object o:list
             ) {
            System.out.println(o.toString());
        }
        scanner.close();
    }
}
