package com.atjerry.study.iterator.interviewTest;

import org.junit.Test;

/**
 * @BelongsProject: Demo
 * @BelongsPackage: com.atjerry.study.iterator.interviewTest
 * @Author: Jerry
 * @CreateTime: 2024-06-30  17:45
 * @Description:
 * @Version: 1.0
 */

public class interviewTest {
    @Test
    public void testFor() {
        String[] arr1 = new String[]{"AA", "CC", "DD"};

        //赋值操作1
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = "MM";
        }

        //赋值操作2
        /*for (String s : arr1){//类似重新new了一个对象 arr1未改变
            s = "MM";
        }*/

        for (String s : arr1) {
            System.out.println(s);
        }
    }
}
