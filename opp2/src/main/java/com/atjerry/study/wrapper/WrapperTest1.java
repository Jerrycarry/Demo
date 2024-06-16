package com.atjerry.study.wrapper;

import org.junit.Test;

/**
 * @BelongsProject: Demo
 * @BelongsPackage: com.atjerry.study.wrapper
 * @Author: Jerry
 * @CreateTime: 2024-06-16  15:16
 * @Description:
 * @Version: 1.0
 */

public class WrapperTest1 {


    @Test
    public void test1() {

        //方式一：
        int i1 = 10;
        String str1 = String.valueOf(i1);
        System.out.println(str1);

        boolean b1 = true;
        Boolean b2 = b1;
        String str2 = String.valueOf(b1);
        String str3 = String.valueOf(b2);

        //方式二：
        String str4 = i1 + "";
        String str5 = b1 + "";

    }

    @Test
    public void test2() {
        String abc1 = "abc1";
        int i = Integer.parseInt(abc1);
        System.out.println(i + 10);

        String b = "true";
        boolean b1 = Boolean.parseBoolean(b);
        System.out.println(b1);
    }
}
