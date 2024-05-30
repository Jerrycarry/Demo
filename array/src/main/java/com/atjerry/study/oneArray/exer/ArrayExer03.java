package com.atjerry.study.oneArray.exer;

import java.util.Scanner;

/**
 * @BelongsProject: Demo
 * @BelongsPackage: com.atjerry.study.one.Exer
 * @Author: Jerry
 * @CreateTime: 2024-05-19  20:18
 * @Description: TODO
 * @Version: 1.0
 */
/*
案例：学生考试等级划分
从键盘读入学生成绩，找出最高分，并输出学生成绩等级。
成绩>=最高分-10等级为'A'
成绩>=最高分-20等级为'B
成绩>=最高分-30等级为'C
其余
等级为'D
 */
public class ArrayExer03 {

    public static void main(String[] args) {

        //1.先输入学生人数,根据人数创建动态数组
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入学生人数:");
        int studentCount = scanner.nextInt();

        int[] scores = new int[studentCount];
        //2.根据提示,依次输入学生成绩,并将成绩保存在数组元素中
        System.out.println("请输入" + studentCount + "个学生成绩");
        for (int i = 0; i < scores.length; i++) {
            scores[i] = scanner.nextInt();
        }
        //3.获取学生的最大值

        int maxScore = 0;
        for (int i = 0; i < scores.length; i++) {
            if (maxScore < scores[i]) {
                maxScore = scores[i];
            }
        }
        System.out.println("最高分是" + maxScore);
        //4.遍历数组元素,根据学生成绩与最高分的差值,得到每个学生的等级,并输出成绩和等级
        char grade;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] >= maxScore - 10) {
                grade = 'A';
            } else if (scores[i] >= maxScore - 20) {
                grade = 'B';
            } else if (scores[i] >= maxScore - 30) {
                grade = 'C';
            } else {
                grade = 'D';
            }
            System.out.println("第" + (i + 1) + "同学的成绩为:" + scores[i] + "等级为" + grade);
        }
        scanner.close();

    }
}
