package com.atjerry.study.constructor.exer3;

/**
 * @BelongsProject: Demo
 * @BelongsPackage: com.atjerry.study.constructor.exer3
 * @Author: Jerry
 * @CreateTime: 2024-06-02  00:11
 * @Description: TODO
 * @Version: 1.0
 */

public class Account {

    private int id;

    private double balance;

    private double annualInterestRate;

    public Account(int i, double b, double a) {
        id = i;
        balance = b;
        annualInterestRate = a;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public void withdraw(double a) {//取钱
        if (a <= balance && a > 0) {
            balance -= a;
            System.out.println("成功取出" + a + "元");
        } else {
            System.out.println("余额不足,取款失败");
        }
    }

    public void deposit(double a) {//存钱
        if (a > 0) {
            balance += a;
            System.out.println("成功存入：" + a);
        }
    }
}
