package com.atjerry.study._interface.apply;



/**
 * @BelongsProject: Demo
 * @BelongsPackage: com.atjerry.study._interface.apply
 * @Author: Jerry
 * @CreateTime: 2024-06-14  21:35
 * @Description: TODO
 * @Version: 1.0
 */

public class USBTest {

    public static void main(String[] args) {
        //1.创建接口实现类的对象
        Computer computer = new Computer();
        Printer printer = new Printer();


        computer.transferData(printer);

        //2.创建接口实现类的匿名对象
        computer.transferData(new Camera());

        //3.创建接口匿名实现类的匿名对象
        USB usb1 = new USB() {
            @Override
            public void start() {
                System.out.println("U盘开始传输数据");
            }

            @Override
            public void stop() {
                System.out.println("传输数据结束");
            }
        };
        computer.transferData(usb1);

        //4.创建接口匿名实现类的匿名对象
        computer.transferData(new USB() {
            @Override
            public void start() {
                System.out.println("扫描仪开始工作");
            }

            @Override
            public void stop() {
                System.out.println("扫描仪结束工作");
            }
        });
    }
}

class Computer{
    public void transferData(USB usb){//多态体现 USB usb = new Printer();
        System.out.println("设备连接成功..........");
        usb.start();

        System.out.println("数据传输的细节操作");
        usb.stop();
    }
}

class Camera implements USB{

    @Override
    public void start() {
        System.out.println("按下快门");
    }

    @Override
    public void stop() {
        System.out.println("照相结束");
    }
}

class Printer implements USB{


    @Override
    public void start() {
        System.out.println("打印机开始工作");
    }

    @Override
    public void stop() {
        System.out.println("打印机结束工作");
    }
}

interface USB{
    //声明常量
    //USB的长、宽、高


    //方法
    public abstract void start();
    void stop();

}
