package com.atjerry.study.opp;

/**
 * @BelongsProject: Demo
 * @BelongsPackage: com.atjerry.study.opp
 * @Author: Jerry
 * @CreateTime: 2024-05-22  21:39
 * @Description: TODO
 * @Version: 1.0
 */

public class Phone {

    //属性
    String name;
    double price;

    public void call() {
        System.out.println("打电话");
    }

    public void sendMessage(String message) {
        System.out.println("发送信息" + message);
    }

    public void playGame() {
        System.out.println("手机可以玩游戏");
    }
}
