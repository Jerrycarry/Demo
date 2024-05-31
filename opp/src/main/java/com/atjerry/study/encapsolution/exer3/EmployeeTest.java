package com.atjerry.study.encapsolution.exer3;

/**
 * @BelongsProject: Demo
 * @BelongsPackage: com.atjerry.study.encapsolution.exer3
 * @Author: Jerry
 * @CreateTime: 2024-06-01  01:34
 * @Description: TODO
 * @Version: 1.0
 */

public class EmployeeTest {

    public static void main(String[] args) {
        Employee employee = new Employee();

        employee.setName("蔡博文");
        employee.setGender("男");
        employee.setAge(25);
        employee.setTelephone(18296585289L);

        System.out.println(employee.toString());

    }
}
