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

    private char gender;

    private int age;

    private String telephone;

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getInfo(){
       return   "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", telephone=" + telephone;
    }
}
