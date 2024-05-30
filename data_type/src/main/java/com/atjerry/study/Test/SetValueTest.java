package com.atjerry.study.Test;

/**
 * @BelongsProject: Demo
 * @BelongsPackage: com.atjerry.study
 * @Author: Jerry
 * @CreateTime: 2024-05-12  20:09
 * @Description: TODO
 * @Version: 1.0
 */

/*
 * 测试运算符的的使用2:赋值运算符的使用
 * 1.= += -= *= /= %=
 * 说明
 * 当=两侧数据类型不一致时,可以使用强制转换类型或使用强制类型转换原则进行处理
 * 支持连续赋值
 * += -= *= /= %=  不会改变数值本身
 * */
public class SetValueTest {

    public static void main(String[] args){
        int i = 5;

        long l = 10;//自动类型提升

        byte b = (byte) i;//强制类型转换

        //操作方式1:
        int a1 = 10;
        int b1= 10;
        //操作方式2:连续赋值
        int a2;
        int b2;
        a2 = b2 = 10;
        System.out.println(a2 + "," + b2);
        //操作方式3:
        int a3 = 10, b3 = 30;
        System.out.println(a3 + "," + b3);

        //说明+=的使用
        int m1 = 10;
        //m1 += 5; //相当于 m1 = m1 + 5
        System.out.println(m1);

        m1-= 5; //相当于 m1 = m1 - 5
        System.out.println(m1);


    }
}
