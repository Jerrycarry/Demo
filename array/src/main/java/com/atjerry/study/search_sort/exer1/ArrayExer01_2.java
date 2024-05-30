package com.atjerry.study.search_sort.exer1;

/**
 * @BelongsProject: Demo
 * @BelongsPackage: com.atjerry.study.search_sort.exer1
 * @Author: Jerry
 * @CreateTime: 2024-05-20  23:05
 * @Description: TODO
 * @Version: 1.0
 */


//数组的缩容
public class ArrayExer01_2 {
    public static void main(String[] args) {

        //现有数组,需删除数组中索引为4的元素。
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7};


        int deleteIndex = 4;
        //方式1:不新建数组
        /*for (int i = deleteIndex; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = 0;

         */

        //方式2:新建数组,新的数组的长度比原来数组的长度少1个
        int[] newArray = new int[arr.length - 1];
        for (int i = 0; i < deleteIndex; i++) {
            newArray[i] = arr[i];
        }
        for (int i = deleteIndex; i < arr.length - 1; i++) {
            newArray[i] = arr[i + 1];
        }


        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + "\t");
        }
    }
}
