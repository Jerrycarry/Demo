package com.atjerry.study._this.exer1;

/**
 * @BelongsProject: Demo
 * @BelongsPackage: com.atjerry.study._this.exer1
 * @Author: Jerry
 * @CreateTime: 2024-06-02  23:48
 * @Description: TODO
 * @Version: 1.0
 */

public class Girl {
    private String name;
    private int age;

    public Girl() {
    }

    public Girl(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void marry(Boy boy){
        System.out.println("我想嫁给" + boy.getName());
        boy.marry(this);
    }

    /**
     * 比较两个Girl对象的大小
     * @param girl
     * @return 正数：当前对象大；负数：当前对象小
     */
    public int compare(Girl girl){
        if (this.age > girl.age){
            return 1;
        }else if (this.age < girl.age){
            return -1;
        }else {
            return 0;
        }
    }
}
