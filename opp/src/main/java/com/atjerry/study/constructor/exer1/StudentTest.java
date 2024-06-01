package com.atjerry.study.constructor.exer1;

/**
 * @BelongsProject: Demo
 * @BelongsPackage: com.atjerry.study.constructor.exer1
 * @Author: Jerry
 * @CreateTime: 2024-06-01  23:05
 * @Description: TODO
 * @Version: 1.0
 */

public class StudentTest {
    public static void main(String[] args) {

        Student s1 = new Student("刘强东",48,"中国人民大学","社会学");
        System.out.println(s1.getInfo());
        Student s2 = new Student("奶茶妹妹",28,"清华大学");
        System.out.println(s2.getInfo());

    }
}
