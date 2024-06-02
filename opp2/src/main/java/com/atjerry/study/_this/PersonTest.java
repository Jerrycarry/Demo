package com.atjerry.study._this;

/**
 * @BelongsProject: Demo
 * @BelongsPackage: com.atjerry.study._this
 * @Author: Jerry
 * @CreateTime: 2024-06-02  22:09
 * @Description: TODO
 * @Version: 1.0
 */

public class PersonTest {

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setAge(10);
        System.out.println(p1.age);
    }
}

class Person{
    String name;
    int age;
    String email;

    public Person(){}

    public Person(String n,String e){
        name = n;
        email = e;
    }

    public  void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }
}
