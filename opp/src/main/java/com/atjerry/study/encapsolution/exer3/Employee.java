package com.atjerry.study.encapsolution.exer3;

/**
 * @BelongsProject: Demo
 * @BelongsPackage: com.atjerry.study.encapsolution.exer3
 * @Author: Jerry
 * @CreateTime: 2024-06-01  01:29
 * @Description: TODO
 * @Version: 1.0
 */

public class Employee {

    private String name;

    private String gender;

    private int age;

    private long telephone;

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setTelephone(long telephone) {
        this.telephone = telephone;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public long getTelephone() {
        return telephone;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", telephone=" + telephone +
                '}';
    }
}
