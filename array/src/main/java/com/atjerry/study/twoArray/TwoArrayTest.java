package com.atjerry.study.twoArray;

/**
 * @BelongsProject: Demo
 * @BelongsPackage: com.atjerry.study.twoArray.exer
 * @Author: Jerry
 * @CreateTime: 2024-05-19  21:06
 * @Description: TODO
 * @Version: 1.0
 */

public class TwoArrayTest {
    public static void main(String[] args) {
        //1.一维数组的声明与初始化
        int[] arr1 = new int[]{1, 2, 3};

        //方式1:静态初始化
        int[][] arr2 = new int[][]{{1, 2, 3}, {4, 5}, {6, 7, 8, 9}};
        //方式2:动态初始化:数组变量的赋值和数组元素的赋值分开进行
        String[][] arr3 = new String[3][4];

        //方式2:动态初始化
        double[][] arr4 = new double[2][];

        //其他正确的写法:
        int arr5[][] = new int[][]{{1, 2, 3}, {4, 5, 6}, {6, 6, 7, 8}};
        int[] arr6[] = new int[][]{{1, 2, 3}, {4, 5, 6}, {6, 3, 4, 5}};
        int arr7[][] = {{1, 2, 3}, {4, 5}, {6, 7, 8, 9}};
        String arr8[][] = new String[3][4];

        //2.数组元素的调用
        System.out.println(arr2[0][0]);
        System.out.println(arr3[2][1]);

        //调用外层元素
        System.out.println(arr2[0]);

        //测试arr3、arr4
        arr3[0][1] = "Tom";
        System.out.println(arr3[0][1]);
        System.out.println(arr3[0]);//[Ljava.lang.String;@3b07d329

        arr4[0] = new double[4];
        arr4[0][0] = 1.0;
        //3.数组的长度
        System.out.println(arr2.length);
        System.out.println(arr2[0].length);
        System.out.println(arr2[1].length);
        System.out.println(arr2[2].length);

        //4.如何遍历数组
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print(arr2[i][j] + "\t");
            }
        }

    }
}
