package com.atjerry.study.method.MethodTest;

/**
 * @BelongsProject: Demo
 * @BelongsPackage: com.atjerry.study.method
 * @Author: Jerry
 * @CreateTime: 2024-05-26  15:55
 * @Description: TODO
 * @Version: 1.0
 */

public class methodTest {

    public static void main(String[] args) {
        Person person = new Person();

        person.name = "蔡博文";
        person.age = 20;
        person.gender = '男';

        person.interests("篮球");
    }
}
