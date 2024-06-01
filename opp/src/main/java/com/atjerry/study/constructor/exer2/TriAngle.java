package com.atjerry.study.constructor.exer2;

/**
 * @BelongsProject: Demo
 * @BelongsPackage: com.atjerry.study.constructor.exer2
 * @Author: Jerry
 * @CreateTime: 2024-06-01  23:57
 * @Description: TODO
 * @Version: 1.0
 */

public class TriAngle {

    private double base;

    private double height;

    public void setBase(double b) {
        base = b;
    }

    public void setHeight(double h) {
        height = h;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    public TriAngle() {

    }

    public TriAngle(double b, double h) {
        base = b;
        height = h;
    }

    public double findArea() {
        return base * height / 2;
    }

    public String getInfo() {
        return "base = " + base + "height = " + height;
    }

}
