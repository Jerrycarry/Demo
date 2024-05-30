package com.atjerry.study.twoArray;

/**
 * @BelongsProject: Demo
 * @BelongsPackage: com.atjerry.study.twoArray
 * @Author: Jerry
 * @CreateTime: 2024-05-19  22:18
 * @Description: TODO
 * @Version: 1.0
 */
/*
二维数组的默认初始化
 */
public class TwoArrayTest1 {
    public static void main(String[] args) {
        //5.数组元素的默认初始化值
        int [][] arr = new int[3][2];
        //外层元素默认值
        System.out.println(arr[0]);//地址值
        System.out.println(arr[1]);
        //内层元素默认值
        System.out.println(arr[0][0]);
        System.out.println(arr[0][1]);//0

        boolean [][] arr2 = new boolean[3][2];
        //外层元素默认值
        System.out.println(arr2[0]);//地址值
        System.out.println(arr2[1]);
        //内层元素默认值
        System.out.println(arr2[0][0]);//false
        System.out.println(arr2[0][1]);

        String [][] arr3 = new String[3][2];
        System.out.println(arr3[0]);//地址
        System.out.println(arr3[0][1]);//null

    }
}
