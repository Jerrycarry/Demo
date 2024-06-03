package com.atjerry.study._this.exer2;

/**
 * @BelongsProject: Demo
 * @BelongsPackage: com.atjerry.study._this.exer2
 * @Author: Jerry
 * @CreateTime: 2024-06-03  19:34
 * @Description: TODO
 * @Version: 1.0
 */

public class Customer {

    private String firstName;
    private String lastName;
    private Account account;

    public Customer(String f, String l) {
        this.firstName = f;
        this.lastName = l;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public Account getAccount() {
        return account;
    }

    public void  setAccount(Account account) {
        this.account = account;
    }
}
