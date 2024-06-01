package com.atjerry.study.encapsolution.exer4;

/**
 * @BelongsProject: Demo
 * @BelongsPackage: com.atjerry.study.encapsolution.exer4
 * @Author: Jerry
 * @CreateTime: 2024-06-01  19:43
 * @Description: TODO
 * @Version: 1.0
 */

class Order {
    //声明不同权限的属性
    private int orderPrivate;

    int orderDefault;

    public int orderPublic;

    //声明不同权限的方法

    private void methodPrivate(){

    }

    void methodDefault(){

    }

    public void methodPublic(){

    }

    public void test(){
        orderPrivate = 1;
        orderDefault = 2;
        orderPublic = 3;

        methodPrivate();
        methodDefault();
        methodPublic();
    }
}
