package com.atjerry.study.stringmore;

import com.sun.org.apache.xpath.internal.operations.String;
import org.junit.Test;


/**
 * @BelongsProject: Demo
 * @BelongsPackage: com.atjerry.study.stringmore
 * @Author: Jerry
 * @CreateTime: 2024-06-26  00:41
 * @Description:
 * @Version: 1.0
 */

public class StringBufferBuilderTest {


    /**
     * (1)StringBuffer append(xx):提供了很多的append()方法，用于进行字符串追加的方式拼接
     * (2)StringBuffer delete(int stort,int end):删除[start,end)之间字符
     * (3)StringBuffer deleteCharAt(int index.):别除[index]位置字符
     * (4)StringBuffer replace(int start,int end,String str):替换[start,end)范围的字符
     * (5)void setCharAt(int index,char c):替换[index]位置字符
     * (6)char charat(int index):查找指定index位置上的字符
     * (7)StringBuffer insert(int index,Xx):在[index]位置插入xx
     * (8)1 nt length()：返回存储的字符数据的长度
     * (9)StringBuffer reverse():反转
     **/

    @Test
    public void testAppend(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("abc").append("def");
        System.out.println(stringBuilder);
    }

    @Test
    public void testDelete(){
        StringBuilder stringBuilder = new StringBuilder("123456");
        stringBuilder.delete(1,4);
        System.out.println(stringBuilder);
    }

    @Test
    public void testDeleteCharAt(){
        StringBuilder stringBuilder = new StringBuilder("12345678");
        stringBuilder.deleteCharAt(2);
        System.out.println(stringBuilder);
    }

}
