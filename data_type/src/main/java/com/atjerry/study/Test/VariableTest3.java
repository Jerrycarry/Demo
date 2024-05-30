package com.atjerry.study.Test;

/**
 * @BelongsProject: Demo
 * @BelongsPackage: com.atjerry.study
 * @Author: Jerry
 * @CreateTime: 2024-05-12  14:23
 * @Description: Test
 * @Version: 1.0
 */

//此VariableTest3用来测试自动类型提升
//基本数据类型间的运算规则：当容量小的变量与容量大的变量做运算时，结果自动转转换为大的数据类型。
//说明：此时的容量小或大，并非指占用内存空间的大小，而是指表示数据范围的大小。
    //特别地:byte、short之间做运算,运算结果为int类型

//byte ---> short ---> int ---> long ---> float ---> double

public class VariableTest3 {

    public static void main(String[] args){
        int i1 = 10;
        int i2 = 11;

        long l1 = 2l;

        float f1 = 11f;

        double d1 = 13513.3;

        byte b1 = 12;

        int i3 = i1+b1;

        System.out.println(i3   );

    }
}
