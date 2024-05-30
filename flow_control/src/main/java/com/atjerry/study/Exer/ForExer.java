package com.atjerry.study.Exer;

/**
 * @BelongsProject: Demo
 * @BelongsPackage: com.atjerry.study.Exer
 * @Author: Jerry
 * @CreateTime: 2024-05-17  21:18
 * @Description: TODO
 * @Version: 1.0
 */

public class ForExer {
    public static void main(String[] args) {
        //题目：输出所有的水仙花数，所谓水仙花数是指一个3位数，其各个位上数字立方和等于其本身。
        //153 = 1*1*1+3*3*3+5*5*5

        for (int i = 100; i <= 999; i++) {

            //针对没一个三位数i,获取其各个位上数值
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100;

            //判断是否满足水仙花数规则
            if (i == ge * ge * ge + shi * shi * shi + bai * bai * bai) {
                System.out.println(i);
            }
        }
        System.out.println("------------------分割线------------------------");

        //说明：输入两个正整数m和n,求其最大公约数和最小公倍数。
        //比如：12和20的最大公约数是4，最小公倍数是60。

        int m = 12;
        int n = 20;

        //获取最小值
        int min = (m < n) ? m : n;

        //最大公约数
        for (int i = min; i >= 1; i--) {
            if (m % i == 0 && n % i == 0) {
                System.out.println("最大公约数" + i);
                break;
            }
        }
        //最小公倍数
        int max = (m > n) ? m : n;

        for (int i = max; i <= m * n; i++) {
            if (i % m == 0 && i % n == 0) {
                System.out.println("最小公倍数为:" + i);
                break;
            }
        }


    }
}
