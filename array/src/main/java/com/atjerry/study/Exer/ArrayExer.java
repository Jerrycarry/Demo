package com.atjerry.study.Exer;

/**
 * @BelongsProject: Demo
 * @BelongsPackage: com.atjerry.study.Exer
 * @Author: Jerry
 * @CreateTime: 2024-05-20  22:14
 * @Description: TODO
 * @Version: 1.0
 */

//数组的反转
public class ArrayExer {
    public static void main(String[] args) {
        int[] arr = new int[]{40, 50, 30, 60, 90, 100, 60};

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }

        System.out.println();

        //反转操作
        //方式一:
        /*
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }*/
        //方式二:
        for (int i = 0, j = arr.length; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        //方式三:创建新数组放入,不推荐

        //遍历
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");

        }
    }
}
