package com.atjerry.study.Test;

/**
 * @BelongsProject: Demo
 * @BelongsPackage: com.atjerry.study.Test
 * @Author: Jerry
 * @CreateTime: 2024-05-14  22:11
 * @Description: TODO
 * @Version: 1.0
 */
/*
分支结构1: if-else条件判断结构

1.格式
格式1:
if(条件表达式){
    语句块;
}

格式2:"二选一"
if(条件表达式){
    语句块;
}else{
    语句块;
}

格式3:"多选一"
if(条件表达式){
    语句块
}else if(条件表达式){
    语句块
}else if(条件表达式n){
    语句块n;
}else {
    语句块;
}
结论：
1.如果多个条件表达式之间没有交集（理解是互斥关系），则哪个条件表达式声明在上面，哪个声明在下面都可以。
如果多个条件表达式之间是包含关系，则需要将范围小的条件表达式声明在范围大的条件表达式的上面。否则，范围小的条件表生效后范围大则不会生效
* */
public class IfElseTest {
    public static void main(String[] args) {

        /*
        案例1：成年人心率的正常范围是每分钟60-100次。体检时，
        如果心率不在此范围内，则提示需要做进一步的检查。
        */

        int heartBeats = 80;
        if (heartBeats < 60 || heartBeats > 100) {
            System.out.println("您需要做进一步检查");
        } else {
            System.out.println("恭喜您体检完成,身体健康。");
        }


        /*
        案例2：定义一个整数，判定是偶数还是奇数
        */

        int num = 13;
        if (num % 2 == 0) {
            System.out.println(num + "是偶数");
        }else {
            System.out.println(num + "是奇数");
        }

        /*
        案例3:
        岳小鹏参加们Java考试，他和父亲岳不群达成承诺：
        如果：
        成绩为100分时，奖励一辆跑车：
        成绩为(80,99]时，奖励一辆山地自行车：
        当成绩为[60,80]时，奖励环球影城一日游：
        其它时，胖揍一顿。
        说明：默认成绩是在[0,100]范围内
         */



        int score = 61;

        if (score == 100){
            System.out.println("奖励一辆跑车");
        } else if (score >80 && score <=99) {
            System.out.println("奖励一辆山地自行车");
        } else if (score >= 60 && score <= 80) {
            System.out.println("奖励环球影城一日游");
        }else {
            System.out.println("胖揍一顿");
        }

    }
}
