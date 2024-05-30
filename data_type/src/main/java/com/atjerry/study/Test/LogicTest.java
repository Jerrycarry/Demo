package com.atjerry.study.Test;

/**
 * @BelongsProject: Demo
 * @BelongsPackage: com.atjerry.study
 * @Author: Jerry
 * @CreateTime: 2024-05-12  23:57
 * @Description: TODO
 * @Version: 1.0
 */

/*
 * 测试运算符的使用4:逻辑运算符
 * 1.& && | || !a a^b
 * 2.逻辑运算符针对的都是Boolean类型的变量进行的操作。
 * 3.逻辑运算符常使用在条件判断、循环结构中。
 * */
public class LogicTest {
    public static void main(String[] args) {

        //& &&的区别
        //1.相同点：两个符号表达的都是“且”的关系。只有当符号左右两边的类型值均为true时，结果才为true
        //2.执行过程:
        //（1）如果符号左边为true,则&、&&都会执行右边的程序。
        //（2）如果符号左边为false,则&会执行右边的程序,&&不会执行右边的程序。
        boolean b1 = false;
        int num1 = 10;
        if (b1 & (num1++ > 0)) {
            System.out.println("床前明月光");
        } else {
            System.out.println("我叫郭德纲");
        }
        System.out.println("num = " + num1);


        boolean b2 = false;
        int num2 = 10;
        if (b2 && (num2++ > 0)) {
            System.out.println("床前明月光");
        } else {
            System.out.println("我叫郭德纲");
        }
        System.out.println("num = " + num2);

//**********************************************************************
        /*
         * |和||的区别
         * 1.相同点:两个符号表达的都是”或“的关系,只要符号两边存在ture的情况,结果就成true。
         * 2.执行过程:
         * (1)如果符号左边为true,则|、||都会执行右边的程序。
         *（2）如果符号左边为false,则|会执行右边的程序,||不会执行右边的程序。
         * 3.开发中推荐使用||
         * */

        boolean b3 = false;
        b3 = true;
        int num3 = 10;
        if (b3 | (num3++ > 0)) {
            System.out.println("窗前明月光");
        } else {
            System.out.println("疑似地上霜");
        }
        System.out.println("num3 = " + num3);

        boolean b4 = false;
        b4 = true;
        int num4 = 10;
        if (b4 || (num4++ > 0)) {
            System.out.println("窗前明月光");
        } else {
            System.out.println("疑似地上霜");
        }
        System.out.println("num4 = " + num4);
    }

}
