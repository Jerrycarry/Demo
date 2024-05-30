package com.atjerry.study.Test;

/**
 * @BelongsProject: Demo
 * @BelongsPackage: com.atjerry.study
 * @Author: Jerry
 * @CreateTime: 2024-05-12  22:22
 * @Description: TODO
 * @Version: 1.0
 */

/*
* 测试运算符的使用3:比较运算符
* 1. == != >  < >= <= instanceof
* 2. instanceof 多态
* */
public class CompareTest {
    public static void main(String[] args){
        int m1 = 10;
        int m2 = 20;
        boolean compare1 = m1 > m2;
        System.out.println(compare1);

        boolean  b = true;
        if (b == true){        //如果是if (b = true) 则输出为false
            System.out.println("输出为true");
        }else {
            System.out.println("输出为false");
        }
    }
}
