package com.atjerry.study.threadsafe.exer;

/**
 * @BelongsProject: Demo
 * @BelongsPackage: com.atjerry.study.threadsafe.exer
 * @Author: Jerry
 * @CreateTime: 2024-06-23  12:21
 * @Description: 新年快乐倒计时
 * @Version: 1.0
 */

public class HappyNewYear {

    public static void main(String[] args) {

        for (int i = 10; i >= 0; i--) {
            try {
                Thread.sleep(1000); //睡1s
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (i > 0) {
                System.out.println(i);
            } else {
                System.out.println("HappyNewYear!");
            }
        }
    }
}
