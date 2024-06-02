package com.atjerry.study._this.exer1;

/**
 * @BelongsProject: Demo
 * @BelongsPackage: com.atjerry.study._this.exer1
 * @Author: Jerry
 * @CreateTime: 2024-06-03  00:11
 * @Description: TODO
 * @Version: 1.0
 */

public class BoyGirlTest {

    public static void main(String[] args) {
        Boy boy1 = new Boy("杰克",24);
        Girl girl1 = new Girl("露丝",20);

        girl1.marry(boy1);

        boy1.shout();
    }



}
