package com.atjerry.study.Test;

/**
 * @BelongsProject: Demo
 * @BelongsPackage: com.atjerry.study
 * @Author: Jerry
 * @CreateTime: 2024-05-12  18:42
 * @Description: TODO
 * @Version: 1.0
 */


/*
* 测试运算符的的使用1:算数运算符的使用
* 1.+ - + - * / % (前)++ (后)++ (前)-- (后)--
* */
public class AriTest {
    public static void main(String[] args){
        int m1 = 12;
        int n2 = 5;
        int k1 = m1/n2;
        System.out.println(k1);//2

        System.out.println(m1/n2*n2);//10

        //取模运算(取余)
        int i1 = 12;
        int j1 = 5;
        System.out.println(i1 % j1);//2

        //结论:取模以后,结果与被模的符号相同
        int i2 = -12;
        int j2 = 5;
        System.out.println(i2 % j2);//-2

        int i3 = 12;
        int j3 = -5;
        System.out.println(i3 % j3);//2

        int i4 = -12;
        int j4 = -5;
        System.out.println(i4 % j4);//-2


        //前++:先自增加1,再进行赋值
        //后++:先进行赋值,后自增加1

        int a1 = 10;
        int b1 = ++a1;
        System.out.println("a1 = " + a1 + "\t" + "b1 = " + b1);//a1 = 11 b1 = 11

        int a2 = 10;
        int b2 = a2++;
        System.out.println("a2 = " + a2 + "\t" + "b2 = " + b2);//a2 = 11 b2 = 10

        //int i = 1;  //先i++ i = 2 ++i i = 3 i++ i = 3
        //int j = i++ + ++i * i++;
        //System.out.println("j = " + j);

        int i = 2;
        int j = i++;
        System.out.println(i);//3
        System.out.println(j);//2





    }
}
