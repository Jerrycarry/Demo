package com.atjerry.study._interface.exer1;

/**
 * @BelongsProject: Demo
 * @BelongsPackage: com.atjerry.study._interface.exer1
 * @Author: Jerry
 * @CreateTime: 2024-06-14  23:47
 * @Description:
 * @Version: 1.0
 */

public class VehicleTest {
    public static void main(String[] args) {

        Developer developer = new Developer();

        //创建三个交通工具，保存在数组中
        Vehicle[] vehicles = new Vehicle[3];

        vehicles[0] = new Bicycle("捷安特","骚红色");
        vehicles[1] = new ElectricVehicle("雅迪","天蓝色");
        vehicles[2] = new Car("奔驰","黑色","沪A8888");


        for (int i = 0; i < vehicles.length; i++) {
            developer.tankingVehicle(vehicles[i]);
        }
    }
}
