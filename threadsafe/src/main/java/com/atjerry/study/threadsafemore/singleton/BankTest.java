package com.atjerry.study.threadsafemore.singleton;


/**
 * @BelongsProject: Demo
 * @BelongsPackage: com.atjerry.study.threadsafemore.singleton
 * @Author: Jerry
 * @CreateTime: 2024-06-23  14:25
 * @Description: 实现线程安全的懒汉式
 * @Version: 1.0
 */

public class BankTest {

    static Bank b1 = null;
    static Bank b2 = null;

    public static void main(String[] args) {
        Thread t1 = new Thread() {
            @Override
            public void run() {
                b1 = Bank.getInstance();
            }
        };

        Thread t2 = new Thread() {
            @Override
            public void run() {
                b2 = Bank.getInstance();
            }
        };

        t1.start();
        t2.start();

        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b1 == b2);
    }
}

class Bank {

    private Bank() {
    }

    private static volatile Bank instance = null;

    /*方式一public synchronized static Bank getInstance(){//同步监视器，默认为Bank.class

        if (instance == null){

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            instance = new Bank();
        }
        return instance;
    }*/

    public static Bank getInstance() {//同步监视器，默认为Bank.class 效率更高,为了避免指令重排,需要将instance声明为volatile
        if (instance == null) {
            synchronized (Bank.class) {
                if (instance == null) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    instance = new Bank();
                }
            }
        }
        return instance;
    }
}