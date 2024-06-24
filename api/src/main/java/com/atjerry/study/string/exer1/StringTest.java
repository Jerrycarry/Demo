package com.atjerry.study.string.exer1;

/**
 * @BelongsProject: Demo
 * @BelongsPackage: com.atjerry.study.string.exer1
 * @Author: Jerry
 * @CreateTime: 2024-06-23  23:47
 * @Description:
 * @Version: 1.0
 */

public class StringTest {

    String str = "good";

    char[] ch = {'t','e','s','t'};

    public void change(String str,char ch[]){
        str = "test ok";
        ch[0] = 'b';
    }

    public static void main(String[] args){
        StringTest stringTest = new StringTest();
        stringTest.change(stringTest.str,stringTest.ch);
        System.out.println(stringTest.str);//good
        System.out.println(stringTest.ch);//best
    }
}
