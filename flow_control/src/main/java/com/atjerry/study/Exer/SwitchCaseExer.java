package com.atjerry.study.Exer;

import java.util.Scanner;

/**
 * @BelongsProject: Demo
 * @BelongsPackage: com.atjerry.study.Exer
 * @Author: Jerry
 * @CreateTime: 2024-05-15  23:50
 * @Description: TODO
 * @Version: 1.0
 */

//switch-case练习
/*
题目：模拟ATM取款
声明变量balance并初始化为0，用以表示银行账户的余额，下面通过ATM机程序实现存款，取款等功能。
=========ATM========
1、存款
2、取款
3、显示余额
4、退出
请选择(1-4)：
*/
public class SwitchCaseExer {
    public static void main(String[] args) {

        //定义balance的变量,记录账户余额
        double balance = 0.0;

        boolean flag = true;//控制循环的结束


        System.out.println("=========ATM========");
        //实例化Scanner
        Scanner scanner = new Scanner(System.in);
        do {
            //2.声明ATM取款界面
            System.out.println("1、存款");
            System.out.println("2、取款");
            System.out.println("3、显示余额");
            System.out.println("4、退出");
            System.out.println("请选择(1-4):");

            int selection = scanner.nextInt();
            switch (selection) {
                case 1:
                    System.out.println("请输入存款金额:");
                    double money1 = scanner.nextDouble();
                    if (money1 > 0) {
                        balance += money1;
                    }
                    break;
                case 2:
                    System.out.println("请输入取款金额:");
                    double money2 = scanner.nextDouble();
                    if (money2 > 0 && balance > money2) {
                        balance -= money2;
                    }else {
                        System.out.println("你的余额不足");
                    }
                    break;
                case 3:
                    System.out.println("您当前的存款金额为:"+balance);
                    break;
                case 4:
                    flag = false;
                    System.out.println("感谢使用,欢迎下次光临！");
                    break;
                default:
                    System.out.println("输入有误,请重新输入");
            }
        } while (flag);
        scanner.close();
    }
}
