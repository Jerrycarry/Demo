package com.atjerry.study.list.exer1;

import java.util.Objects;

/**
 * @BelongsProject: Demo
 * @BelongsPackage: com.atjerry.study.list.exer1
 * @Author: Jerry
 * @CreateTime: 2024-06-30  20:31
 * @Description: 实现类
 * @Version: 1.0
 */

public class Student {

    private String name;

    private int age;

    public Student() {
    }

    public Student(String name, int age) {
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

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
