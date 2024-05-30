package com.atjerry.study.Test;

/**
 * @BelongsProject: Demo
 * @BelongsPackage: com.atjerry.study
 * @Author: Jerry
 * @CreateTime: 2024-05-12  11:33
 * @Description: TODO
 * @Version: 1.0
 */
/*
* 测试整型变量的使用
* */
public class VariableTest1 {
    public static void main(String[] args) {

        //1.测试整型变量的使用
        byte b1 = 12;
        byte b2= 127;
        //超过存储范围 编译不通过
        //byte b3 = 128

        short s1 = 1234;

        int i1 = 1241434;
        //声明long类型时后缀需要加上l或者L
        long l1 = 123115155L;

        //2.浮点型变量的使用 float/double 声明float类型时后缀需要加上f或F
        double d1 = 12.3;
        float f1 = 12.3f;

        System.out.println("f1 = " + f1);

        //3.字符型变量的使用 char
        char gender = '男';

        //4.布尔型变量的使用 boolean



    }
}
