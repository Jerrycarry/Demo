package com.atjerry.study.search_sort.exer2;

/**
 * @BelongsProject: Demo
 * @BelongsPackage: com.atjerry.study.search_sort.exer2
 * @Author: Jerry
 * @CreateTime: 2024-05-21  00:03
 * @Description: TODO
 * @Version: 1.0
 */
/*
二分查找法
定义数组：int[]arr2=new int[]{2,4,5,81215,19,26,37,49,51,66,89,100};
查找元素5是否在上述数组中出现过?如果出现，输出对应的索引值。
 */
public class BinarySearchTest {
    public static void main(String[] args) {

        int[] arr2 = new int[]{2, 4, 5, 81215, 19, 26, 37, 49, 51, 66, 89, 100};

        int target = 5;

        boolean isFlag = true;//

        int head = 0;//默认首索引

        int end = arr2.length - 1;//默认的尾索引 12

        while (head <= end) {
            int middle = (head + end) / 2;

            if (target == arr2[middle]) {
                System.out.println("找到了" + target + "对应的位置为:" + middle);
                isFlag = false;
                break;
            } else if (target > arr2[middle]) {
                head = middle + 1;
            } else {//target < arr2[middle]
                end = middle - 1;
            }

            if (!isFlag){
                System.out.println("不好意思,未找到");
            }
        }
    }
}
