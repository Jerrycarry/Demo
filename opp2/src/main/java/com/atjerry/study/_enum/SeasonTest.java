package com.atjerry.study._enum;

/**
 * @BelongsProject: Demo
 * @BelongsPackage: com.atjerry.study._enum
 * @Author: Jerry
 * @CreateTime: 2024-06-15  22:15
 * @Description:
 * @Version: 1.0
 */

public class SeasonTest {



}

//5.0之前定义枚举类的定义
class Season{
    //2.声明当前类的对象的实例变量
    private final String seasonName;//季节名称
    private final String seasonDesc;//季节描述

    //1.私有类的构造器
    private Season(String seasonName,String seasonDesc){
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

    //3.提供实例变量的Get方法


    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }

    //4.创建当前类的对象
    public static final Season SPRING = new Season("春天","春暖花开");
    public static final Season SUMMER = new Season("夏天","夏日炎炎");
    public static final Season AUTUMN = new Season("秋天","秋高气爽");
    public static final Season WINTER = new Season("冬天","白雪皑皑");


    @Override
    public String toString() {
        return "Season{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonDesc='" + seasonDesc + '\'' +
                '}';
    }
}
