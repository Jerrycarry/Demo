package com.atjerry.study.Collection;

import java.util.Objects;

/**
 * @BelongsProject: Demo
 * @BelongsPackage: com.atjerry.study.Collection
 * @Author: Jerry
 * @CreateTime: 2024-06-29  22:47
 * @Description:
 * @Version: 1.0
 */

public class Person {

    private String name;

    private int age;

    public Person(){

    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        System.out.println("Person equals().........");
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    /*@Override
    public int hashCode() {
        return Objects.hash(name, age);
    }*/
}
