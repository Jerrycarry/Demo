package com.atjerry.study.oneArray;

/**
 * @BelongsProject: Demo
 * @BelongsPackage: com.atjerry.study.one
 * @Author: Jerry
 * @CreateTime: 2024-05-19  18:23
 * @Description: TODO
 * @Version: 1.0
 */

/*
一维数组的基本使用
 */
public class OneArrayTest {
    public static void main(String[] args) {

        //1.数组的声明与初始化
        //复习:变量的定义格式:数据类型 变量名 = 变量值
        int num1 = 10;
        int num2;//声明
        num2 = 20;//赋值

        //1.1声明数组
        double[] prices;
        //1.2数组的初始化
        //静态初始化:
        prices = new double[]{20.32, 20.56, 30.12};

        //数组的声明和初始化
        //动态初始化:
        String[] foods = new String[4];


        //其他正确方式
        int arr[] = new int[4];
        int [] arr1 = {1,2,3,4};//类型推断

        //2.数组元素的调用
        //通过角标的方式,获取数组的元素
        //角标的范围从0开始,到数组的长度-1结束
        System.out.println(prices[0]);
        System.out.println(prices[2]);
        //System.out.println(prices[-4]);//报异常:ArrayIndexOutOfBoundsException数组角标异常

        foods[0] = "拌海蜇";
        foods[1] = "红烧肉";
        foods[2] = "麻辣小龙虾";
        foods[3] = "玉米片";


        //3.数组的长度
        System.out.println(prices.length);//3
        System.out.println(foods.length);//4

        //4.如何遍历数组
        for (int i =0;i < foods.length;i++){
            System.out.println(foods[i]);
        }
        for (int i = 0; i < prices.length; i++) {
            System.out.println(prices[i]);
        }
    }
}
