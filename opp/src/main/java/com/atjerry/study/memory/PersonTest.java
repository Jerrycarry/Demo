package com.atjerry.study.memory;

/**
 * @BelongsProject: Demo
 * @BelongsPackage: com.atjerry.study.memory
 * @Author: Jerry
 * @CreateTime: 2024-05-22  22:07
 * @Description: TODO
 * @Version: 1.0
 */

public class PersonTest {

    public static void main(String[] args) {

        Person person = new Person();

        person.name = "蔡博文";
        person.age = 25;
        person.gender = '男';

        person.info();
        //easy过
    }
}
