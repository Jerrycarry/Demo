package com.atjerry.study.threadsafe.runnablesafe;

/**
 * @BelongsProject: Demo
 * @BelongsPackage: com.atjerry.study.runnablesafe
 * @Author: Jerry
 * @CreateTime: 2024-06-23  11:34
 * @Description: 使用同步方法解决实现runnable接口的线程安全问题。
 * @Version: 1.0
 */

class SaleTicket1 implements Runnable {

    int ticket = 100;
    boolean isFlag = true;
    Object object = new Object();

    @Override
    public void run() {

        while (isFlag) {
            show();
        }

    }

    public synchronized void show(){//此时的同步监视器是this.此题目中的s 即唯一的
        if (ticket > 0) {

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "售票，票号为：" + ticket);
            ticket--;
        }else {
            isFlag = false;
        }
    }
}

public class WindowTest1 {

    public static void main(String[] args) {
        SaleTicket1 saleTicket1 = new SaleTicket1();

        Thread t1 = new Thread(saleTicket1);
        Thread t2 = new Thread(saleTicket1);
        Thread t3 = new Thread(saleTicket1);

        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}
