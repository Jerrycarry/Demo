package com.atjerry.study.Test;

/**
 * @BelongsProject: Demo
 * @BelongsPackage: com.atjerry.study.Test
 * @Author: Jerry
 * @CreateTime: 2024-05-19  10:35
 * @Description: TODO
 * @Version: 1.0
 */

/*
输出100以内的质数
 */
public class PrimeNumberTest {
    public static void main(String[] args) {

        //获取当前系统的时间
        long start = System.currentTimeMillis();

        boolean flag = true; //记录i的约数个数(从2开始,到i-1为止)

        int count = 0;//记录质数的个数
        for (int i = 1; i <= 100000; i++) {//遍历100以内的自然数


            //判断i是否为质数
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                count++;
                //System.out.println(i);
            }
            //重置flag
            flag = true;

        }
        long end = System.currentTimeMillis();
        System.out.println("质数个数是:" + count);
        System.out.println("花费时间:" + (end-start));

    }
}
