package com.atjerry.study._interface.exer1;

/**
 * @BelongsProject: Demo
 * @BelongsPackage: com.atjerry.study._interface.exer1
 * @Author: Jerry
 * @CreateTime: 2024-06-14  23:30
 * @Description:
 * @Version: 1.0
 */

public class ElectricVehicle extends Vehicle implements IPower{

    public ElectricVehicle() {
    }

    public ElectricVehicle(String brand, String color) {
        super(brand, color);
    }

    @Override
    public void run() {
        System.out.println("电动车通过电力驱动");
    }

    @Override
    public void power() {
        System.out.println("电动车通过电力提供动力");
    }
}
