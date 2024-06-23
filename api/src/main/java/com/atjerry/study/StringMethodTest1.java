package com.atjerry.study;

import org.junit.Test;

/**
 * @BelongsProject: Demo
 * @BelongsPackage: com.atjerry.study
 * @Author: Jerry
 * @CreateTime: 2024-06-23  23:13
 * @Description:
 * @Version: 1.0
 */

public class StringMethodTest1 {

    /**
     * (1)boolean isEmpty():字符串是否为空
     * (2)int length():返回字符串的长度
     * (3)String concat(xx):拼接
     * (4)boolean equals(object obj.):比较字符串是否相等，区分大小写
     * (5)boolean equalsIgnoreCase(object obj):比较字符串是否相等，不区分大小写
     * (6)int compareTo(String other):比较字符串大小，区分大小写，按照Jn-code编码值比较大小
     * (7)int compareToIgnoreCase(String other.):比较字符串大小，不区分大小写
     * (8)String toLowerCase():将字符串中大写字母转为小写
     * (9)String toUpperCase():将字符串中小写字母转为大写
     * (10)Str1 ng trim():去掉字符串前后空白符
     * (11)public String intern():结果在常量池中共亭
     **/

    @Test
    public void test1(){
        String s1 = "";
        String s2 = new String();
        String s3 = new String("");

        System.out.println(s1.isEmpty());
        System.out.println(s2.isEmpty());
        System.out.println(s3.isEmpty());

        String s5 = "hello";
        System.out.println(s5.length());

    }

    @Test
    public void test2(){
        String s1 = "HELLo";
        String s2 = "HELLO";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));//忽略大小写 验证码场景可以忽略

        String s3 = "abcd";
        String s4 = "adef";
        System.out.println(s3.compareTo(s4));//-2


        String s5 = "    he ll  oo    ";
        System.out.println("****" + s5.trim() + "****");//中间空白不会去除，搜索注册应用场景
    }
}
