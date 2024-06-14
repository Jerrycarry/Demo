package com.atjerry.study._interface.exer1;

/**
 * @BelongsProject: Demo
 * @BelongsPackage: com.atjerry.study._interface.exer1
 * @Author: Jerry
 * @CreateTime: 2024-06-14  23:26
 * @Description:
 * @Version: 1.0
 */

public class Bicycle extends Vehicle implements IPower{

    public Bicycle() {
    }

    public Bicycle(String brand, String color) {
        super(brand, color);
    }

    @Override
    public void run() {
        System.out.println("自行车通过人力脚踏行驶");
    }

    @Override
    public void power() {
        System.out.println("自行车通过人力提供动力");
    }
}
