package com.atjerry.study.method_more.recursion.exer1;

import com.atjerry.study.method_more.recursion.RecursionTest;

/**
 * @BelongsProject: Demo
 * @BelongsPackage: com.atjerry.study.method_more.recursion.exer1
 * @Author: Jerry
 * @CreateTime: 2024-05-30  23:06
 * @Description: TODO
 * @Version: 1.0
 */

public class RecursionExer01 {
    //练习1：裴波那契数列
    //已知一个数列：f(20)=1,f(21)=4,f(n+2)=2*f(n+1)+f(n)
    //其中n是大于0的整数，求f(10)的值。

    public static void main(String[] args) {
        RecursionExer01 test = new RecursionExer01();

        int n = 10;
        System.out.println(test.f(n));
    }

    public int f(int n) {
        if (n == 20) {
            return 1;
        } else if (n == 21) {
            return 4;
        } else {
            return f(n + 2) - 2 * f(n + 1);
        }
    }


    public int func(int n) {
        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return 4;
        }else {
            return  2*func(n-1)+f(n-2);
        }
    }
}
