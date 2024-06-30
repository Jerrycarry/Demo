package com.atjerry.study.string.exer2;


import org.junit.Test;

/**
 * @BelongsProject: Demo
 * @BelongsPackage: com.atjerry.study.string.exer2
 * @Author: Jerry
 * @CreateTime: 2024-06-23  23:56
 * @Description: 将一个字符串反转。将指定部分反转
 * @Version: 1.0
 */

public class StringTest {

    @Test
    public void test(){
        String s = "abcdefg";
        String s1 = reverse(s, 2, 5);
        System.out.println(s1);
    }

    /**
     * 方式1：将String转为char[],针对char[]数组进行相应位置的反转，反转以后将char[]转为String
     **/

    public String reverse(String str,int fromIndex,int toIndex){

        char[] arr = str.toCharArray();

        for (int i = fromIndex,j = toIndex; i < j; i++,j--) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        return new String(arr);
    }

    /**
     * 方式2：
     **/

    @Test
    public String reverse1(String str,int fromIndex,int toIndex){
        //获取str第一部分
        String finalStr = str.substring(0,fromIndex);
        //拼接第二部分
        for (int i = toIndex; i >= fromIndex; i--) {
            finalStr += str.charAt(i);
        }

        finalStr += str.substring(toIndex + 1);

        return finalStr;
    }

    /**
     * @Author CaiBowen
     * @Description //TODO 判断subStr在str中出现的次数
     * @Date  2024/6/24 0:22
     * @Param * @param str
     * @param subStr
     * @return * @return {@link int }
     **/
    
    @Test
    public int getSubStringCount(String str,String subStr){
        int count = 0;//记录出现次数
        int index = str.indexOf(subStr);

        while(index > 0){
            count++;
           index =  str.indexOf(subStr,index + subStr.length());
        }

        return count;
    }

}
