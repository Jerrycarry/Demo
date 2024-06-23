package com.atjerry.study.threadsafe.runnablesafe;

/**
 * @BelongsProject: Demo
 * @BelongsPackage: com.atjerry.study.nosafe
 * @Author: Jerry
 * @CreateTime: 2024-06-21  00:37
 * @Description: 三个窗口买票使用方式Runnable接口方式
 * @Version: 1.0
 */


class SaleTicket implements Runnable {

    int ticket = 100;

    Object object = new Object();

    @Override
    public void run() {

        while (true) {
            synchronized(object){
                if (ticket > 0) {

                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "售票，票号为：" + ticket);
                    ticket--;
                } else {
                    break;
                }
            }

        }
    }
}

public class WindowTest {

    public static void main(String[] args) {
        SaleTicket saleTicket = new SaleTicket();

        Thread t1 = new Thread(saleTicket);
        Thread t2 = new Thread(saleTicket);
        Thread t3 = new Thread(saleTicket);

        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}
