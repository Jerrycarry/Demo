package com.atjerry.study.search_sort.exer1;

/**
 * @BelongsProject: Demo
 * @BelongsPackage: com.atjerry.study.search_sort.exer1
 * @Author: Jerry
 * @CreateTime: 2024-05-20  22:40
 * @Description: TODO
 * @Version: 1.0
 */

public class ArrayExer01_1 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};

        //扩容1倍容量
        //int [] newArray = new int[arr.length * 2];
        int[] newArray = new int[arr.length << 1];

        //将原有数组中的元素复制到新的数组中
        for (int i = 0; i < arr.length; i++) {
            newArray[i] = arr[i];
        }
        //将10,20,30三个数据添加到新数组中
        newArray[arr.length] = 10;
        newArray[arr.length + 1] = 20;
        newArray[arr.length + 2] = 30;

        //将新的数组的地址赋值给原有的数组变量
        arr = newArray;

        //遍历
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
