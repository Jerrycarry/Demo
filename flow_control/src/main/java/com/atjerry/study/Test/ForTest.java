package com.atjerry.study.Test;

/**
 * @BelongsProject: Demo
 * @BelongsPackage: com.atjerry.study.Test
 * @Author: Jerry
 * @CreateTime: 2024-05-17  20:33
 * @Description: TODO
 * @Version: 1.0
 */
/*
 * 1.Java中规范了3种循环结构:for、while、do-while
 * 2.凡是循环结构,就一定会有四个要素。
 * ①初始化条件
 * ②循环条件
 * ③循环体
 * ④迭代部分
 *
 *3.for循环格式(①;②;④)
 *            {
 *      ③
 * }
 *
 * */
public class ForTest {
    public static void main(String[] args) {
        System.out.println("开始********************");
        //输出5行HelloWorld
        for (int i = 1; i <= 5; i++) {
            System.out.println("HelloWorld");
        }
        System.out.println("----------------分隔线---------------");

        //需求3:遍历1-100以内的偶数,并获取偶数的个数,获取所有的偶数的和
        int sum = 0;
        int count = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                count++;
                sum += i;//sum = sum + i
            }
        }
        System.out.println("偶数的个数是:" + count + "," + "偶数的和是:" + sum);
    }
}
