package com.atjerry.study.wrapper;
import org.junit.Test;

/**
 * @BelongsProject: Demo
 * @BelongsPackage: com.atjerry.study.wrapper
 * @Author: Jerry
 * @CreateTime: 2024-06-16  13:43
 * @Description:
 * @Version: 1.0
 */

public class WrapperTest {

    //基本数据类型-->包装类：① 使用包装类的构造器
    //包装类 --->基本数据类型：


    @Test
    public void test1() {
        int i = 10;
        Integer ii1 = new Integer(i);
        System.out.println(ii1.toString());//10

        float f1 = 12.3F;
        f1 = 32.2F;
        Float f11 = new Float(f1);
        System.out.println(f11.toString());//12.3

        String s1 = "32.1";
        Float ff2 = new Float(s1);

        //s1 = "abc";
        //Float ff3 = new Float(s1); 报异常：NumberFormatException

        boolean b1 = true;
        Boolean bb1 = new Boolean(b1);
        System.out.println(bb1);

        String s2 = "false";
        s2 = "False123";
        s2 = "TrUe";
        Boolean bb2 = new Boolean(s2);
        System.out.println(bb2.toString());

        //推荐使用方式：
        int i2 = 10;
        Integer ii2 = Integer.valueOf(i2);

        Boolean b22 = Boolean.valueOf(true);

        Float f2 = Float.valueOf(12.3F);
    }

    @Test
    public void test2(){
        //自动装箱:基本数据类型 ----> 包装类
        int i1 = 10;
        Integer ii1 = i1;//自动装箱

        Integer ii2 = i1 + 1;//自动装箱

        Boolean bb1 = true;//自动装箱

        //自动拆箱：包装类 ----> 基本数据类型

        int i2 = ii1; //
        boolean b1 = bb1;//自动拆箱
    }
}
