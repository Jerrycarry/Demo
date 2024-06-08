package com.atjerry.study.singleton;

import sun.security.jca.GetInstance;

/**
 * @BelongsProject: Demo
 * @BelongsPackage: com.atjerry.study.singleton
 * @Author: Jerry
 * @CreateTime: 2024-06-08  22:45
 * @Description: TODO
 * @Version: 1.0
 */

public class GirlFriendTest {
    public static void main(String[] args) {

    }
}


//懒汉式
class GirlFriend{

    //1.类的构造器私有化
    private GirlFriend(){

    }

    //2.声明当前类的实例
    private static GirlFriend instance = null;

    //3.通过调用GetXxx()方法来获取当前类的实例，必须声明为static
    private static GirlFriend GetInstance(){
        if (instance == null){
            instance = new GirlFriend();
        }
        return instance;

    }
}
