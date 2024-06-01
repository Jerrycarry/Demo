package com.atjerry.study.constructor.exer2;

/**
 * @BelongsProject: Demo
 * @BelongsPackage: com.atjerry.study.constructor.exer2
 * @Author: Jerry
 * @CreateTime: 2024-06-02  00:05
 * @Description: TODO
 * @Version: 1.0
 */

public class TriAngleTest {

    public static void main(String[] args) {

        //创建TriAngle1实例
        TriAngle t1 = new TriAngle();
        t1.setHeight(3.4);
        t1.setBase(2.3);
        System.out.println(t1.findArea());


        //创建TriAngle2的实例
        TriAngle t2 = new TriAngle(2.3,3.4);
        System.out.println("底边长：" + t2.getBase());
        System.out.println("高为：" + t2.getHeight());
        System.out.println("面积为：" + t2.findArea());


    }
}
