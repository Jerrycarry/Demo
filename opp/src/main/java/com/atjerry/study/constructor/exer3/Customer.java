package com.atjerry.study.constructor.exer3;

/**
 * @BelongsProject: Demo
 * @BelongsPackage: com.atjerry.study.constructor.exer3
 * @Author: Jerry
 * @CreateTime: 2024-06-02  00:19
 * @Description: TODO
 * @Version: 1.0
 */

public class Customer {
    private String firstName;
    private String lastName;
    private Account account;

    public Customer(String f, String l) {
        firstName = f;
        lastName = l;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
