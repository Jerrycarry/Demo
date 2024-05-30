package com.atjerry.study.method_more.args.exer;

/**
 * @BelongsProject: Demo
 * @BelongsPackage: com.atjerry.study.method_more.args.exer
 * @Author: Jerry
 * @CreateTime: 2024-05-26  22:57
 * @Description: TODO
 * @Version: 1.0
 */

public class StringConCatTest {
    //练习：可变形参的方法
    //个字符串进行拼接，每一个字符串之间使用某字符进行分割，如果没有传入字符串，那么返回空字符串""
    public static void main(String[] args) {

        StringConCatTest test = new StringConCatTest();
        String info = test.concat("-","hello","world");
        System.out.println(info);
    }

    public String concat(String operator,String ...strs){
        String result = "";
        for (int i = 0; i < strs.length; i++) {
            if (i == 0){
                result += strs[i];
            }else {
                result += (operator + strs[i]);
            }
        }
        return result;
    }
}
