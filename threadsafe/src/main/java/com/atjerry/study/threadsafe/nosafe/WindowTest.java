package com.atjerry.study.threadsafe.nosafe;

/**
 * @BelongsProject: Demo
 * @BelongsPackage: com.atjerry.study.nosafe
 * @Author: Jerry
 * @CreateTime: 2024-06-21  00:37
 * @Description:
 * @Version: 1.0
 */

//三个窗口买票  使用方式Runnable接口方式

class SaleTicket implements Runnable {

    int ticket = 100;

    @Override
    public void run() {
        while (true) {
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
