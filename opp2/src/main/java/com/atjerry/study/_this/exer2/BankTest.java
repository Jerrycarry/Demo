package com.atjerry.study._this.exer2;

/**
 * @BelongsProject: Demo
 * @BelongsPackage: com.atjerry.study._this.exer2
 * @Author: Jerry
 * @CreateTime: 2024-06-03  19:57
 * @Description: TODO
 * @Version: 1.0
 */

public class BankTest {

    public static void main(String[] args){
         Bank bank = new Bank();
         bank.addCustomer("操","曹");
         bank.addCustomer("备","刘");

         bank.getCustomer(0).setAccount(new Account(1000));
         bank.getCustomer(0).getAccount().withdraw(50);
    }
}
