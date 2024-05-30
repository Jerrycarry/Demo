package com.atjerry.study.method_more.valuetransfer;


/**
 * @BelongsProject: Demo
 * @BelongsPackage: com.atjerry.study.method_more.valuetransfer
 * @Author: Jerry
 * @CreateTime: 2024-05-28  20:57
 * @Description: TODO
 * @Version: 1.0
 */

public class ValueTransferTest1 {

    public static void main(String[] args) {
        ValueTransferTest1 test = new ValueTransferTest1();

        //对于基本数据类型的变量来说
        int m = 10;

        test.method1(m);
        System.out.println("m = " + m);//10


        //对于引用数据类型的变量来说

        Person p = new Person();
        p.age = 10;

        test.method2(p);
        System.out.println(p.age);//11

    }


    public void method1(int m){
        m++;
    }

    public void method2(Person p){
        p.age++;
    }

}
class Person{
    int age;
}

