package com.atjerry.study.wrapper.exer1;



import java.util.Scanner;
import java.util.Vector;

/**
 * @BelongsProject: Demo
 * @BelongsPackage: com.atjerry.study.wrapper.exer1
 * @Author: Jerry
 * @CreateTime: 2024-06-16  16:15
 * @Description:
 * @Version: 1.0
 */

public class ScoreTest {
    public  static void main(String[] args){
        //1.创建Vector对象
        Vector vector = new Vector();
        Scanner scanner = new Scanner(System.in);

        int maxScore = 0;//用来记录最高值

        //2.从键盘获取多个学生成绩,存放到V中(以负数输入代表结束)
        while(true){
        System.out.println("请输入学生成绩(以负数为结尾代表结束)");
        int intScore = scanner.nextInt();
        if (intScore < 0){
            break;
        }
        //装箱 int ---> Integer对象
        //Integer score = Integer.valueOf(intScore);
        //添加学生成绩到容器中 jdk5.0之后直接
            vector.addElement(intScore);
            //vector.addElement(score);
            //3.获取学生成绩的最大值
            if (maxScore < intScore){
                maxScore = intScore;
            }
        }
        //4.依次获取v中每个学生
        for (int i = 0; i < vector.size(); i++) {
            Object elementAt = vector.elementAt(i);
            //拆箱
            //Integer integerScore = (intScore) elementAt;

            //自动拆箱
            int score = (Integer) elementAt;
            char grade = ' ';

            if (maxScore - score <=10){
                grade = 'A';
            }else if (maxScore - score <= 20){
                grade = 'B';
            }else if (maxScore - score <= 30){
                grade = 'C';
            }else {
                grade = 'D';
            }
            System.out.println("最高分是" + maxScore);
            System.out.println("student" + i + "score is" + score +"grade is" + grade);
        }
        scanner.close();

    }
}
