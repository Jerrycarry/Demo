package com.atjerry.study.opp;

/**
 * @BelongsProject: Demo
 * @BelongsPackage: com.atjerry.study.opp
 * @Author: Jerry
 * @CreateTime: 2024-05-22  21:46
 * @Description: TODO
 * @Version: 1.0
 */

public class PhoneTest {
    public static void main(String[] args) {

        //创建Phone的对象
        //复习:
        Phone phone = new Phone();

        //通过Phone的对象调用其内部声明的属性或方法
        phone.name = "华为";
        phone.price = 5999;

        System.out.println("name=" + phone.name + "," + "price=" + phone.price);

        phone.call();
        phone.sendMessage("有内鬼,终止交易。");
        phone.playGame();
    }
}
