package com.atjerry.study.Test;

/**
 * @BelongsProject: Demo
 * @BelongsPackage: com.atjerry.study.Test
 * @Author: Jerry
 * @CreateTime: 2024-05-13  21:43
 * @Description: TODO
 * @Version: 1.0
 */

//测试运算符的的使用6:条件运算符的使用
/*
1.(条件表达式)? 表达式1:表达式2
2.说明:
    条件运算符的结果是boolean类型
    如果条件表达式结果是true,则执行表达式,否则执行表达式2。
*/
public class ConditionTest {
    public static void main(String[] args) {
        String info = (2 > 1) ? "你喜欢我" : "我不喜欢你";
        System.out.println(info);

        //获取两个整数的较大值
        int i1 = 20;
        int i2 = 10;

        int max = (i1 > i2) ? i1 : i2;

        System.out.println("较大值为:" + max);
    }
}
