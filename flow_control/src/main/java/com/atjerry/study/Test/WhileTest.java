package com.atjerry.study.Test;

/**
 * @BelongsProject: Demo
 * @BelongsPackage: com.atjerry.study.Test
 * @Author: Jerry
 * @CreateTime: 2024-05-17  21:53
 * @Description: TODO
 * @Version: 1.0
 */

/* 1.循环结构之一:while
 * 2.凡是循环结构,就一定会有四个要素。
 * ①初始化条件
 * ②循环条件
 * ③循环体
 * ④迭代部分
 * 3.while的格式
 * ①
 * while(②){
 *    ③
 *    ④
 * }
 * */
public class WhileTest {
    public static void main(String[] args) {
        //输出5行HelloWorld
        int i = 1;
        while (i <= 5) {
            System.out.println("HelloWorld");
            i++;
        }

        //需求3:遍历1-100以内的偶数,并获取偶数的个数,获取所有的偶数的和
        int count = 0;
        int sum = 0;
        int i1 = 1;
        while (i1 <= 100) {
            if (i1 % 2 == 0){
                System.out.println(i1);
                count++;
                sum += i1;
            }
            i1++;
        }
        System.out.println("count=" + count + ",sum=" + sum);
    }
}
