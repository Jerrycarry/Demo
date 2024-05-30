package com.atjerry.study.example.exer4;

/**
 * @BelongsProject: Demo
 * @BelongsPackage: com.atjerry.study.example.exer4
 * @Author: Jerry
 * @CreateTime: 2024-05-26  18:39
 * @Description: TODO
 * @Version: 1.0
 */

public class MyArrays {
    //求最大值

    /**
     * 获取int[]数组的最大值
     *
     * @param arr 要获取最大值的数组
     * @return 数组的最大值
     */
    public int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    /**
     * 获取int[]数组的最小值
     *
     * @param arr
     * @return 数组的最小值
     */
    public int getMin(int[] arr) {

        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    /**
     * 获取int[]数组的总和
     *
     * @param arr
     * @return
     */
    public int getSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    /**
     * 获取int[]数组的平均值
     *
     * @param arr
     * @return 数组的平均值
     */
    public int getAvg(int[] arr) {
        int avg = getSum(arr) / arr.length;
        return avg;
    }

    public void print(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                System.out.print(arr[i]);
            } else {
                System.out.print("," + arr[i]);
            }
        }
        System.out.println("]");
    }

    public int[] copy(int[] arr) {
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }

    /**
     * 反转数组元素
     * @param arr
     */
    public void reverse(int[] arr) {
        for (int i = 0,j = arr.length-1;i < j;i++,j++) {
            //交互arr[i]与arr[j]的位置
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    /**
     * 数组从小到大排序
     * @param arr
     */
    public void sort(int[] arr) {
        for (int j = 0; j < arr.length - 1; j++) {
            for (int i = 0; i < arr.length - 1- j; i++) {
                if (arr[i] > arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                
            }
        }
            
        }
    }

    /**
     * 使用线性查找算法,查找指定的元素
     * @param arr 待查找的元素
     * @param target 要查找的元素
     * @return target元素在arr中的索引位置,若未找到，则返回-1
     */
    public int linearSearch(int[] arr,int target) {

        for (int i = 0; i <arr.length ; i++) {
            if (target == arr[i]){
                return i;
            }
        }
        return -1;
    }


}
