package com.atjerry.study.threadsafe.threadsafe;

/**
 * @BelongsProject: Demo
 * @BelongsPackage: com.atjerry.study.threadsafe
 * @Author: Jerry
 * @CreateTime: 2024-06-23  11:55
 * @Description: 使用同步方法解决Thread类中线程安全问题
 * @Version: 1.0
 */

class Window1 extends Thread {

    static int ticket = 100;
    static Object object = new Object();
    static boolean isFlag = true;

    @Override
    public void run() {
        while (isFlag) {
            //synchronized(this)此时表示w1,w2,w2,不保证唯一性
            //synchronized(obj)使用static后，就能保证唯一性
            //Class clz = Window.class 是唯一的
            show();
        }
    }
    //public synchronized void show(){//此时同步监视器为this。此题目中this:w1,w2,w3,仍然是线程不安全的
    public static synchronized void show(){//此时同步监视器为：当前类本身，即window1.class,是唯一的。
        if (ticket > 0) {

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "售票，票号为：" + ticket);
            ticket--;
        } else {
            isFlag = false;
        }
    }
}

public class WindowTest1 {
    public static void main(String[] args) {
        Window w1 = new Window();
        Window w2 = new Window();
        Window w3 = new Window();

        w1.setName("窗口1");
        w2.setName("窗口2");
        w3.setName("窗口3");

        w1.start();
        w2.start();
        w3.start();
    }
}
