package com.atjerry.study.method_more.recursion.exer2;

/**
 * @BelongsProject: Demo
 * @BelongsPackage: com.atjerry.study.method_more.recursion.exer2
 * @Author: Jerry
 * @CreateTime: 2024-05-30  23:25
 * @Description: TODO
 * @Version: 1.0
 */

public class RabbitExer {
    public static void main(String[] args){
        RabbitExer rabbitExer = new RabbitExer();
        int mouth = 24;
        System.out.println(rabbitExer.getRabbitNumber(mouth));
    }

    public int getRabbitNumber(int month){
        if (month ==1){
            return 1;
        } else if (month == 2) {
            return 1;
        }else {
           return getRabbitNumber(month - 1) + getRabbitNumber(month -2);
        }
    }
}
