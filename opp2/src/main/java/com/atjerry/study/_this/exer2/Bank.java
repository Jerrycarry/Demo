package com.atjerry.study._this.exer2;

/**
 * @BelongsProject: Demo
 * @BelongsPackage: com.atjerry.study._this.exer2
 * @Author: Jerry
 * @CreateTime: 2024-06-03  19:43
 * @Description: TODO
 * @Version: 1.0
 */

public class Bank {

    private Customer[] customers;
    private int numberOfiCustomer;

    public Bank(){
        customers = new Customer[10];
    }

    /**
     * 将指定姓名的客户保存在银行客户列表里
     * @param f
     * @param l
     */
    public void addCustomer(String f,String l){
        Customer c  = new Customer(f,l);
        customers[numberOfiCustomer] = c;
        numberOfiCustomer++;
    }

    /**
     * 获取客户列表中存储的客户
     * @return
     */
    public int getNumberOfiCustomer() {
        return numberOfiCustomer;
    }

    /**
     * 获取指定位置是的客户
     * @param index
     * @return
     */
    public Customer getCustomer(int index){
        if (index <0 || index >=numberOfiCustomer){
            return null;
        }else {
            return customers[index];
        }
    }
}
