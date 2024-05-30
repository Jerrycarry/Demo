package com.atjerry.study.example.exer5_objarr1;

/**
 * @BelongsProject: Demo
 * @BelongsPackage: com.atjerry.study.example.exer5_objarr1
 * @Author: Jerry
 * @CreateTime: 2024-05-26  20:06
 * @Description: TODO
 * @Version: 1.0
 */


public class StudentUtil {

    /*
    打印出指定年级的学生信息。
     */
    public void printStudentWithState(Student[] students,int state){
        for (int i = 0; i < students.length; i++) {
            if (state == students[i].score) {
                Student stu = students[i];
                System.out.println(stu.show());
            }
        }
    }

    /*
    遍历指定学生数组
     */
    public void printStudents(Student[] students){
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].show());
        }
    }

    /*
    冒泡排序
     */
    public void printBubblesSort(Student[] students){

        for (int i = 0; i < students.length - 1; i++) {
            for (int j = 0; j < students.length - 1 - i; j++) {
                if (students[j].score > students[j+1].score){
                    Student temp = students[j];
                    students[j] = students[j+1];
                    students[j+1] = temp;
                }
            }
        }
    }

}
