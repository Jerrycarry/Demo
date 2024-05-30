package com.atjerry.study.example.exer5_objarr1;

/**
 * @BelongsProject: Demo
 * @BelongsPackage: com.atjerry.study.example.exer5_objarr
 * @Author: Jerry
 * @CreateTime: 2024-05-26  19:33
 * @Description: 定义类Student,包含三个属性：学号number(int),年级state(int),成绩score(int)。
 * @Version: 1.0
 */

public class Student {

    //属性
    int number;
    int state;
    int score;

    public String show(){
        return "number:" + number + " state:" + state + " score:" + score;
    }
}
