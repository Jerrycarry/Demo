package com.atjerry.study.Test;
/**
 * @BelongsProject: Demo
 * @BelongsPackage: com.atjerry.study
 * @Author: Jerry
 * @CreateTime: 2024-05-12  11:33
 * @Description: TODO
 * @Version: 1.0
 */

//变量的基本使用
/*
 * 变量的理解：内存中的一个存储区域，该区域内的数据可以在同一类型范围内不断变化
 * 三要素：数据类型 变量名 存储的值
 * 声明格式：数据类型 变量名 = 变量值
 * */
public class VariableTest {
    public static void main(String[] args) {

        //定义变量的方式1：
        char gender;//变量的声明
        gender = '男';//变量的赋值

        gender = '女';

        //定义变量的方式2：声明与初始化合并
        int age = 10;
        System.out.println(age);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
    }

    public static void main1(String[] args) {

        char gender = '女';
    }
}