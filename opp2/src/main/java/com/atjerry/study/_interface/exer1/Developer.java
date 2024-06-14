package com.atjerry.study._interface.exer1;

/**
 * @BelongsProject: Demo
 * @BelongsPackage: com.atjerry.study._interface.exer1
 * @Author: Jerry
 * @CreateTime: 2024-06-14  23:17
 * @Description:
 * @Version: 1.0
 */

public class Developer {
    //姓名
    private String name;

    //年龄
    private int age;

    public Developer() {
    }

    public Developer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void tankingVehicle(Vehicle vehicle) {
        vehicle.run();
    }
}
