package com.atjerry.study.example.exer4;

/**
 * @BelongsProject: Demo
 * @BelongsPackage: com.atjerry.study.example.exer4
 * @Author: Jerry
 * @CreateTime: 2024-05-26  18:47
 * @Description: TODO
 * @Version: 1.0
 */

public class MyArraysTest {
    public static void main(String[] args) {

        MyArrays arrs = new MyArrays();
        int [] arr = new int[]{45,23,93,45,33,22,15,90};
        //arrs.getMax(arr);

        //求最大值
        System.out.println("最大值为："+arrs.getMax(arr));
        //求平均值
        System.out.println("平均值为："+arrs.getAvg(arr));
        //遍历
        arrs.print(arr);
        //查找
        int index = arrs.linearSearch(arr,56);
        if (index >= 0){
            System.out.println("位置找到了,位置为:" + index);
        }else {
            System.out.println("未找到");
        }

        //排序
        arrs.sort(arr);
        arrs.print(arr);




    }
}
