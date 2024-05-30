package com.atjerry.study.example.exer5_objarr1;

/**
 * @BelongsProject: Demo
 * @BelongsPackage: com.atjerry.study.example.exer5_objarr
 * @Author: Jerry
 * @CreateTime: 2024-05-26  19:35
 * @Description: 创建20个学生对象，学号为1到20，年级和成绩都由随机数确定
 * 问题一：打印出3年级(state值为3)的学生信息。
 * 问题二：使用冒泡排序按学生成绩排序，并遍历所有学生信息
 * @Version: 1.0
 */

public class StudentTest {

    public static void main(String[] args) {

        //创建Student[]
        Student[] students = new Student[20];

        //使用循环,给数组的元素赋值
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student();
            //给每一个学生对象的number state score赋值
            students[i].number = i + 1;
            students[i].state = (int) (Math.random() * 6 + 1);
            students[i].score = (int) (Math.random() * 101);
        }

        //问题一：打印出3年级(state值为3)的学生信息。
        StudentUtil studentUtil = new StudentUtil();
        studentUtil.printStudentWithState(students,3);

        //排序前
        studentUtil.printStudents(students);

        System.out.println("-------------------------");

        //问题二：使用冒泡排序按学生成绩排序，并遍历所有学生信息
        //冒泡排序
        studentUtil.printBubblesSort(students);
        //遍历 排序后
        studentUtil.printStudents(students);
    }

}
