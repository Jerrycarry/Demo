package com.atjerry.study.list.exer2;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @BelongsProject: Demo
 * @BelongsPackage: com.atjerry.study.list.exer2
 * @Author: Jerry
 * @CreateTime: 2024-06-30  21:01
 * @Description:
 * @Version: 1.0
 */

public class ListTest {

    public static void main(String[] args) {

        //需求1:随机生成30个字符,存放在ArrayList中
        ArrayList list = new ArrayList();

        for (int i = 0; i < 30; i++) {
            //'a'-'z'[97-122]
            list.add((char) (Math.random() * (122 - 97 + 1) + 97) + "");
        }

        System.out.println(list);

        int aCount = listTest(list, "a");
        int bCount = listTest(list, "b");
        int cCount = listTest(list, "c");
        int xCount = listTest(list, "x");

        System.out.println("a:" + aCount);
        System.out.println("b:" + bCount);
        System.out.println("c" + cCount);
        System.out.println("x" + xCount);

    }

    public static int listTest(Collection list, String s) {
        int count = 0;
        for (Object o : list) {
            if (s.equals(o)) {
                count++;
            }
        }
        return count;
    }
}
