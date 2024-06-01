package com.atjerry.study.constructor.exer3;

/**
 * @BelongsProject: Demo
 * @BelongsPackage: com.atjerry.study.constructor.exer3
 * @Author: Jerry
 * @CreateTime: 2024-06-02  00:23
 * @Description: TODO
 * @Version: 1.0
 */

public class CustomerTest {
    public static void main(String[] args) {
        Customer customer = new Customer("Jane","Smith");

        Account account = new Account(1000,2000,0.0123);

        customer.setAccount(account);
        customer.getAccount().deposit(100);
        customer.getAccount().withdraw(960);
        customer.getAccount().withdraw(2000);
    }
}
