package com.atjerry.study.encapsolution.exer4;

/**
 * @BelongsProject: Demo
 * @BelongsPackage: com.atjerry.study.encapsolution.exer4
 * @Author: Jerry
 * @CreateTime: 2024-06-01  19:46
 * @Description: TODO
 * @Version: 1.0
 */

public class OrderTest {
    public static void main(String[] args) {
        Order order = new Order();

        //调用属性
        order.orderDefault = 1;
        order.orderPublic =  2;

        //调用方法
        order.methodDefault();
        order.methodPublic();
    }
}
