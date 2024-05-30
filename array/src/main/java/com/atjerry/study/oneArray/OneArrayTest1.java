package com.atjerry.study.oneArray;

/**
 * @BelongsProject: Demo
 * @BelongsPackage: com.atjerry.study.one
 * @Author: Jerry
 * @CreateTime: 2024-05-19  19:07
 * @Description: TODO
 * @Version: 1.0
 */
/*
一维数组的基本使用
 */
public class OneArrayTest1 {
    public static void main(String[] args){
        //数组的默认初始化
        //int型数据类型默认初始化为0
        int [] arr1 = new int[3];
        System.out.println(arr1[0]);

        //short型数据类型默认初始化值为0
        short [] arr2 = new short[3];
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }

        //浮点型数据类型默认初始化值为:0.0
        double [] arr3 = new double[3];
        System.out.println(arr3[0]);

        //字符型默认初始化值为:'0'
        char [] arr4 = new char[3];
        System.out.println(arr4[0]);

        //布尔型数据类型元素的默认初始化值:false
        boolean [] arr5 = new boolean[4];
        System.out.println(arr5[0]);

        //引用数据类型数组元素的默认初始化值为:null
        String [] arr6 = new String[4];
        System.out.println(arr6[0]);


    }
}
