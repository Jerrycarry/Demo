package com.atjerry.study.twoArray.exer;

/**
 * @BelongsProject: Demo
 * @BelongsPackage: com.atjerry.study.twoArray.exer
 * @Author: Jerry
 * @CreateTime: 2024-05-19  22:44
 * @Description: TODO
 * @Version: 1.0
 */

public class ArrayExer01 {

    public static void main(String[] args) {

        //获取数组中所有元素的和
        //初始化数组,静态初始化
        int[][] arr1 = new int[][]{{3, 5, 8}, {2, 6},{1,2,3,4}};

        int sum = 0;//记录元素总和

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                sum += arr1[i][j];
            }
        }
        System.out.println(sum);
    }
}
