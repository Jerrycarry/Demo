package com.atjerry.study.oneArray.exer;

import java.util.Scanner;

/**
 * @BelongsProject: Demo
 * @BelongsPackage: com.atjerry.study.one.Exer
 * @Author: Jerry
 * @CreateTime: 2024-05-19  19:54
 * @Description: TODO
 * @Version: 1.0
 */
/*
案例：输出英文星期几
用一个数组，保存星期一到星期天的7个英语单词，从键盘输入1-7，显示对应的单词
{"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"}
 */

public class ArrayExer02 {
    public static void main(String[] args) {

        String [] weeks = new String[]{"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        //请输入数字:
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入(1-7)的数字:");
        int day = scanner.nextInt();
        if (day<1 || day>7){
            System.out.println("您输入的数字错误,请重新输入");

        }else {
            System.out.println(weeks[day - 1]);
        }

        scanner.close();
        /*switch (number){
            case "1":
                System.out.println(weeks[0]);
                break;
            case "2":
                System.out.println(weeks[1]);
                break;
            case "3":
                System.out.println(weeks[2]);
                break;

            case "4":
                System.out.println(weeks[3]);
                break;

            case "5":
                System.out.println(weeks[4]);
                break;

            case "6":
                System.out.println(weeks[5]);
                break;

            case "7":
                System.out.println(weeks[6]);
                break;

            default:
                System.out.println("请重新输入数字");
        }*/
    }
}
