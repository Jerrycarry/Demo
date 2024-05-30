package com.atjerry.study.Test;

/**
 * @BelongsProject: Demo
 * @BelongsPackage: com.atjerry.study
 * @Author: Jerry
 * @CreateTime: 2024-05-12  16:06
 * @Description: TODO
 * @Version: 1.0
 */


/*1.String类型，属于引用数据类型
  2.String类型的变量，可以使用一对""方式进行赋值
* */

public class StringTest {
    public static void main(String[] args) {
        String str = "Hello world!";
        System.out.println("str");
        System.out.println(str);

        String str2 = " ";
        String str3 = "a";

        //测试连接运算
        int num = 10;
        boolean b1 = true;
        String str4 = "hello";

        System.out.println(str4 + b1);

        String str5 = str4 + b1;
        String str6 = str4 + b1 + num;
        System.out.println(str6); //hellotrue10

        //如何将String类型的变量转换为基本数据类型呢
        String str7 = "abc";//不能考虑转换为基本数据类型的

        int num2 = 10;
        String str8 = num2 + "";//"10"
        //编译不通过
        //如何实现?使用Integer类
        int num3 = Integer.parseInt(str8);
        System.out.println(num3 + 1);


    }
}
