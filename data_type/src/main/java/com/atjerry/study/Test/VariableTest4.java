package com.atjerry.study.Test;

/**
 * @BelongsProject: Demo
 * @BelongsPackage: com.atjerry.study
 * @Author: Jerry
 * @CreateTime: 2024-05-12  15:34
 * @Description: TODO
 * @Version: 1.0
 */
//此VariableTest4用来测试强制类型转换
//规则:
//1.如果需要将容量大的变量的类型转换为容量小的变量的类型,则需要使用强制类型转换。
//2.强制类型转换需要使用强转符:()。在括号内声明需要转换的数据类型。
//3.强制类型转换有可能造成精度丢失。
public class VariableTest4 {

    public static void main(String[] args) {

        double d1 = 12;//自动类型提升

        int i2 = (int) d1;

        System.out.println(i2);

        long l1 = 123;
        short s2 = (short) l1;
        System.out.println(s2);

        int i3 = 123;
        float f1 = i3;//自动类型提升
        System.out.println(f1);

        float f2 = (float) i3;//编译可以通过。只不过可以省略()而已。

        //造成精度丢失的例子
        int i4 = 128;
        byte b1 = (byte) i4;
        System.out.println(b1);//b1 = -128
    }
}
