package com.atjerry.study.threadsafe.exer;

/**
 * @BelongsProject: Demo
 * @BelongsPackage: com.atjerry.study.threadsafe.exer
 * @Author: Jerry
 * @CreateTime: 2024-06-23  13:51
 * @Description:
 * @Version: 1.0
 */

public class AccountTest {


    public static void main(String[] args) {
        Account account = new Account();
        Customer customer1 = new Customer(account,"甲");
        Customer customer2 = new Customer(account,"乙");

        customer1.start();
        customer2.start();
    }



}

class Account{//账户
    private double balance;//账户余额

    public synchronized void deposit(double amt){
        if (amt > 0){
            balance +=amt;
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(Thread.currentThread().getName()+"存钱10000元,余额为：" + balance);
    }


}

class Customer extends Thread{
    Account account;

    public Customer(Account account,String name){
        super(name);
        this.account = account;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {

            account.deposit(1000);
        }
    }
}
