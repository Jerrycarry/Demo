package com.atjerry.study.Exer;

import org.w3c.dom.ls.LSOutput;

/**
 * @BelongsProject: Demo
 * @BelongsPackage: com.atjerry.study
 * @Author: Jerry
 * @CreateTime: 2024-05-12  13:06
 * @Description: TODO
 * @Version: 1.0
 */

//案例1：定义圆周率并赋值为：3.14,现有三个圆的半径分别为：1.2 5.6 6,求他们的面积

public class FloatDoubleExer {
    public static void main(String[] args) {

        //定义圆周率
        double PI = 3.14;

        //定义园的半径
        double radius1 = 1.2;
        double radius2 = 5.6;
        int radius3 = 6;

        //计算圆的面积
        double area1 = PI * radius1 * radius1;
        double area2 = PI * radius2 * radius2;
        double area3 = PI * radius3 * radius3;

        //输出
        System.out.println("圆1的半径为：" + radius1 + "," + "圆1的面积为：" + area1);
        System.out.println("圆2的半径为：" + radius2 + "," + "圆2的面积为：" + area2);
        System.out.println("圆3的半径为：" + radius3 + "," + "圆3的面积为：" + area3);

    }
}
