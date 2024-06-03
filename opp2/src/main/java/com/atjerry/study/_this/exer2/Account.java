package com.atjerry.study._this.exer2;

/**
 * @BelongsProject: Demo
 * @BelongsPackage: com.atjerry.study._this.exer2
 * @Author: Jerry
 * @CreateTime: 2024-06-03  19:25
 * @Description: TODO
 * @Version: 1.0
 */

public class Account {

    private double balance;//余额

    public Account(double init_balance) {
        this.balance = init_balance;
    }

    public double getBalance() {
        return balance;
    }

    //存钱
    public void deposit(double amt) {
        if (amt > 0) {
            balance += amt;
            System.out.println("成功存入："+amt);
        }
    }

    //取钱
    public void withdraw(double amt){
        if (balance >= amt && amt >0){
            balance -= amt;
            System.out.println("取出" +amt);
        }else {
            System.out.println("取钱出错");
        }
    }
}