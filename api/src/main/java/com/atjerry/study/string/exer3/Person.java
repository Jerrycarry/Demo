package com.atjerry.study.string.exer3;

/**
 * @BelongsProject: Demo
 * @BelongsPackage: com.atjerry.study.string.exer3
 * @Author: Jerry
 * @CreateTime: 2024-06-25  00:30
 * @Description:
 * @Version: 1.0
 */

public class Person {
    private String name;//姓名

    private String password;//密码

    public Person(){

    }
    public Person(String name,String password){
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String toString(){
        return name + "-" + password;
    }
}
