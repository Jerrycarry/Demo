package com.atjerry.study.method_more.valuetransfer;

/**
 * @BelongsProject: Demo
 * @BelongsPackage: com.atjerry.study.method_more.valuetransfer
 * @Author: Jerry
 * @CreateTime: 2024-05-26  23:08
 * @Description: TODO
 * @Version: 1.0
 */

public class ValueTransferTest {
    public static void main(String[] args) {
        //1. 基本数据类型的局部变量  基本数据类型赋值的是值
        int m = 10;
        int n = m;

        System.out.println("m = " + m + "n = " + n);// 10 10

        m++;

        System.out.println("m = " + m + "n = " + n);// 11 10

        //2. 引用数据类型局部变量 引用数据类型赋值的是地址
        int[] arr1 = new int[]{1, 2, 3, 4, 5};
        int[] arr2 = arr1;

        arr2[0] = 10;

        System.out.println(arr1[0]);//10

        Order order1 = new Order();
        order1.orderId = 1001;
        Order order2 = order1;

        order2.orderId = 1002;

        System.out.println(order1.orderId);

    }
}
class Order{
    int orderId;
}
