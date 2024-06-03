package com.atjerry.study.project;

/**
 * @BelongsProject: Demo
 * @BelongsPackage: com.atjerry.study.project
 * @Author: Jerry
 * @CreateTime: 2024-06-03  20:31
 * @Description: 客户列表
 * @Version: 1.0
 */

public class CustomerList {

    /**
     * 用于初始化Costomer数组的构造器
     * @param total：指定数组的长度
     */
    private Customer[] customers;//用来存储客户的对象数组
    private int total;//记录已保存客户对象的数量

    /**
     * 用来初始化customers数组
     *
     * @param totalCustomer
     */
    public CustomerList(int totalCustomer) {
        customers = new Customer[totalCustomer];
    }

    /**
     * 把指定的客户添加到数组中
     * @param customer
     * @return true：添加成功 false：添加失败
     */
    public boolean addCustomer(Customer customer) {
        if (total >= customers.length) {
            return false;
        } else {
            customers[total] = customer;
            total++;
            return true;
        }
    }

    /**
     * 修改指定索引位置上的客户信息
     * @param index
     * @param cust
     * @return true：修改成功 false：修改失败
     */
    public boolean replaceCustomer(int index, Customer cust) {
        if (index < 0  && index >=total) {
            return false;
        } else {
            customers[index] = cust;
            return true;
        }
    }
    /**
     * 删除指定索引位置上的客户
     * @param index
     * @return true：删除成功 false：删除失败
     */
    public boolean deleteCustomer(int index) {
        if (index < 0 || index >= total) {
            return false;
        }
        for (int i = 0; i < total - 1; i++) {
            customers[i] = customers[i+1];
        }
        customers[--total] = null;
        return true;
    }

    /**
     * 获取所以客户信息
     * @return
     */
    public Customer[] getAllCustomers() {
       Customer [] custs = new Customer[total];
        for (int i = 0; i < custs.length; i++) {
            custs[i] = customers[i];
        }
        return custs;
    }

    /**
     * 获取指定索引位置上的客户
     * @param index
     * @return 没找到返回null
     */

    public Customer getCustomer(int index) {

        if (index < 0 || index >= total){
            return null;
        }else {
            return customers[index];
        }
    }

    /**
     * 获取存储的客户数量
     * @return
     */
    public int getTotal() {
        return total;
    }
}
