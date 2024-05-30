package com.atjerry.study.search_sort.Exer3;

/**
 * @BelongsProject: Demo
 * @BelongsPackage: com.atjerry.study.search_sort.Exer3
 * @Author: Jerry
 * @CreateTime: 2024-05-21  20:52
 * @Description: TODO
 * @Version: 1.0
 */
/*
案例1：使用冒泡排序，实现整型数组元素的排序操作
比如：
int[]arr=new int[]{34,54,3,2,65,7,34,5,76,34,67};
 */
public class BubbleSortTest {

    public static void main(String[] args) {
        //1.动态数组初始化
        int[] arr = new int[]{34, 54, 3, 2, 65, 7, 34, 5, 76, 34, 67};

        //2.遍历
        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }

}
