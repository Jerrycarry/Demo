package com.atjerry.study.Test;

/**
 * @BelongsProject: Demo
 * @BelongsPackage: com.atjerry.study
 * @Author: Jerry
 * @CreateTime: 2024-05-12  13:41
 * @Description: TODO
 * @Version: 1.0
 */

public class VariableTest2 {
    public static void main(String[] args) {
        //1.字符类型:char(两字节)
        //表示形式1:使用一对''表示，内部有且仅有一个字符
        char c1 = 'a';
        char c2 = '中';
        char c3 = '1';
        char c4 = '%';
        char c5 = 'γ';

        //表示形式2:直接使用/Unicode来表示字符型常量值
        char c6 = '\u0036';
        System.out.println(c6);

        //表示形式3:使用转义字符
        char c7 = '\n';
        char c8 = '\t';

        //表示形式4:使用具体字符对应的数值
        char c9 = 97;
        System.out.println(c9);

        char c10 = '1';
        char c11 = 1;

        //2.布尔类型:boolean(四字节)
        //只有两个取值:true false
        boolean bo1 = true;
        boolean bo2 = false;

        boolean isMarried = true;
        if (isMarried) {
            System.out.println("很遗憾,不能参加单身排队了。");
        }else {
            System.out.println("可以多谈几个女朋友或者男朋友");
        }
    }
}
