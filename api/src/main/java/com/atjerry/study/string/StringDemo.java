package com.atjerry.study.string;


import org.junit.Test;

/**
 * @BelongsProject: Demo
 * @BelongsPackage: com.atjerry.study.string.exer1
 * @Author: Jerry
 * @CreateTime: 2024-06-23  20:55
 * @Description:
 * @Version: 1.0
 */

public class StringDemo {

    @Test
    public void test1() {
        String s1 = "hello";        //字面量的定义方式
    }

    //测试String的连接符：
    @Test
    public void test2() {
        String s1 = "hello";
        String s2 = "world";

        String s3 = "helloworld";
        String s4 = "hello" + "world";
        String s5 = s1 + "world";
        String s6 = "hello" + s2;
        String s7 = s1 + s2;

        System.out.println(s3 == s4);
        System.out.println(s3 == s5);
        System.out.println(s3 == s6);
        System.out.println(s3 == s7);
        System.out.println(s5 == s6);
        System.out.println(s5 == s7);

    }

}
