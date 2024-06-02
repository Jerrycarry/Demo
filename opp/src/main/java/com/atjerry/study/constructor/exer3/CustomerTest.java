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
        Customer customer = new Customer("Jane", "Smith");

        Account account = new Account(1000, 2000, 0.0123);

        //针对客户存钱取钱操作
        customer.setAccount(account);
        customer.getAccount().deposit(100);
        customer.getAccount().withdraw(960);
        customer.getAccount().withdraw(2000);

        //输出客户信息
        //Customer [Smith,Jane]has a account:id is 1000,
        // /annualInterestRate is 1.23%,balance is 1140.0
        System.out.println("Customer[" + customer.getFirstName() + "," + customer.getLastName() + "] has a account:id is"
                + customer.getAccount().getId() + ",annualInterestRate is " + customer.getAccount().getAnnualInterestRate()*100 +
                "%,balance is " + customer.getAccount().getBalance());

    }
}
