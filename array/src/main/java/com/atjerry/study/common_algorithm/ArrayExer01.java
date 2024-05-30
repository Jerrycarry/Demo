package com.atjerry.study.common_algorithm;

/**
 * @BelongsProject: Demo
 * @BelongsPackage: com.atjerry.study.common_algorithm
 * @Author: Jerry
 * @CreateTime: 2024-05-19  23:30
 * @Description: TODO
 * @Version: 1.0
 */

/*
案例：定义一个int型的一维数组，包含10个元素，分别赋一些随机整数，然后求出所有元素的最大值，最小值，总和，
并输出出来。
 */
public class ArrayExer01 {
    public static void main(String[] args) {

        //1.动态初始化创建数组
        int[] arr = new int[10];
        //2.通过循环给数组元素赋值
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * (99 - 10 + 1)) + 10;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+"\t");
        }
        //3.1 求最大值
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("最大值为:" + max);

        //3.2求最小值
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min>arr[i]){
                min = arr[i];
            }
        }
        System.out.println("最小值为:"+min);

        //3.3求总和
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("总和为:" +sum);

        //3.4求平均值
        System.out.println("平均值为:"+(sum/arr.length));

    }

}
