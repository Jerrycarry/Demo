package com.atjerry.study.method.MethodTest;

/**
 * @BelongsProject: Demo
 * @BelongsPackage: com.atjerry.study.method
 * @Author: Jerry
 * @CreateTime: 2024-05-24  22:03
 * @Description: TODO
 * @Version: 1.0
 */

public class Person {

        //属性
        String name;
        int age;
        char gender;


        //方法

        public void eat(){
            System.out.println("吃饭");
        }

        public void sleep(int hour){
            System.out.println("睡了" + hour + "个小时");
        }

        public String interests(String hobby){
            String info = "我的爱好是:" + hobby;
            System.out.println(info);
            return info;
        }

        public int getAge(){
            return age;
        }

}
