package com.atjerry.study._interface.exer1;

/**
 * @BelongsProject: Demo
 * @BelongsPackage: com.atjerry.study._interface.exer1
 * @Author: Jerry
 * @CreateTime: 2024-06-14  23:40
 * @Description:
 * @Version: 1.0
 */

public class Car extends Vehicle implements IPower{

    private String carNumber;//汽车号码

    public Car() {
    }

    public Car(String brand, String color, String carNumber) {
        super(brand, color);
        this.carNumber = carNumber;
    }

    @Override
    public void run() {
        System.out.println("汽车通过内燃机行驶");
    }

    @Override
    public void power() {
        System.out.println("汽车通过汽油提供动力");
    }
}
