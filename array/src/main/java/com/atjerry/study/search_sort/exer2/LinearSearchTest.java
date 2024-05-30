package com.atjerry.study.search_sort.exer2;

/**
 * @BelongsProject: Demo
 * @BelongsPackage: com.atjerry.study.search_sort.exer2
 * @Author: Jerry
 * @CreateTime: 2024-05-20  23:34
 * @Description: TODO
 * @Version: 1.0
 */

/*
线性查找
 */
public class LinearSearchTest {
    public static void main(String[] args) {
        int[] arr1 = new int[]{80, 60, 45, 63, 40, 80, 96, 34};

        //目标元素
        int target = 45;

        //方式1:
        /*
        boolean isFlag = true;
        for (int i = 0; i < arr1.length; i++) {
            if (target == arr1[i]) {
                System.out.println("找到了" + target + "对应的位置为:" + i);
                isFlag = false;
                break;
            }
        }
        if (isFlag){
            System.out.println("不好意思没有找到此元素");
        }

         */
        //方式2
        int i = 0;
        for (;i < arr1.length;i++){
            if (target ==arr1[i]){
                System.out.println("找到了" + target + "对应的位置为:" + i);
                break;
            }
        }
        if (i == arr1.length){
            System.out.println("不好意思,没有找到此元素");
        }
    }
}
