package com.atjerry.study.method.exer;

/**
 * @BelongsProject: Demo
 * @BelongsPackage: com.atjerry.study.method.exer
 * @Author: Jerry
 * @CreateTime: 2024-05-26  16:10
 * @Description: TODO
 * @Version: 1.0
 */

public class EmployeeTest {

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.id = 1001;
        employee.name = "蔡博文";
        employee.age = 25;
        employee.salary = 5000.0;

        employee.show();
    }
}
