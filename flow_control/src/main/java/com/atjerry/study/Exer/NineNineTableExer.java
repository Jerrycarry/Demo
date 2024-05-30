package com.atjerry.study.Exer;

/**
 * @BelongsProject: Demo
 * @BelongsPackage: com.atjerry.study.Exer
 * @Author: Jerry
 * @CreateTime: 2024-05-19  10:21
 * @Description: TODO
 * @Version: 1.0
 */

public class NineNineTableExer {
    public static void main(String[] args){
        //九九乘法表
        for (int i = 1; i <= 9; i++) {

            for (int j = 1; j <= i; j++) {

                System.out.print(i +"*" + j + "=" + i*j + "\t");
            }
            System.out.println();
        }
    }
}
