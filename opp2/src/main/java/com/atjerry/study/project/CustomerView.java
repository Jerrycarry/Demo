package com.atjerry.study.project;


/**
 * @BelongsProject: Demo
 * @BelongsPackage: com.atjerry.study.project
 * @Author: Jerry
 * @CreateTime: 2024-06-03  20:55
 * @Description: TODO
 * @Version: 1.0
 */

public class CustomerView {

    CustomerList customerList = new CustomerList(10);

    //进入主界面的画面
    public void enterMainMenu() {
        boolean isFlag = true;
        while (isFlag) {
            //显示界面
            System.out.println("\n------------------拼电商客户管理系统-------------------------");
            System.out.println("                    1 添 加 客 户                            ");
            System.out.println("                    2 修 改 客 户                            ");
            System.out.println("                    3 删 除 客 户                            ");
            System.out.println("                    4 客 户 列 表                            ");
            System.out.println("                    5 退      出                            ");
            System.out.println("                     请选择(1-5):");
            //获取用户选择：5
            char key = CMUtility.readMenuSelection();
            switch (key) {
                case '1':
                    addNewCustomer();
                    break;
                case '2':
                    modifyCustomer();
                    break;
                case '3':
                    deleteCustomer();
                    break;
                case '4':
                    listAllCustomers();
                case '5':
                    System.out.println("确认是否退出（Y/N）:");
                    char isExit = CMUtility.readConfirmSelection();
                    if (isExit == 'Y') {
                        isFlag = false;
                    }
            }
        }

    }

    private void addNewCustomer() {
        System.out.println("----------------------添加客户----------------------");
        System.out.print("姓名:");
        String name = CMUtility.readString(10);
        System.out.print("性别:");
        char gender = CMUtility.readChar();
        System.out.print("年龄:");
        int age = CMUtility.readInt();
        System.out.print("电话:");
        String phone = CMUtility.readString(13);
        System.out.print("邮箱:");
        String email = CMUtility.readString(30);

        Customer customer = new Customer(name, gender, age, phone, email);
        boolean isSuccess = customerList.addCustomer(customer);
        if (isSuccess) {
            System.out.println("----------------------添加完成----------------------");
        } else {
            System.out.println("-----------------客户目录已满,添加失败----------------------");
        }

    }

    private void modifyCustomer() {
        Customer cust;
        int number;
        for (; ; ) {
            System.out.println("----------------------修改客户信息----------------------");
            System.out.print("请选择待修改客户的编号(-1)");
            number = CMUtility.readInt();

            if (number == -1) {
                return;
            }

            cust = customerList.getCustomer(number - 1);
            if (cust == null) {
                System.out.println("无法找到指定用户");
            } else {
                break;
            }
        }
        //修改客户信息
        System.out.print("姓名(" + cust.getName() + "):");
        String name = CMUtility.readString(10, cust.getName());//限制输入10个字符，如果没有输入直接换行了就用之前的信息
        System.out.print("性别(" + cust.getGender() + "):");
        char gender = CMUtility.readChar(cust.getGender());
        System.out.print("年龄(" + cust.getAge() + "):");
        int age = CMUtility.readInt(cust.getAge());
        System.out.print("电话(" + cust.getPhone() + "):");
        String phone = CMUtility.readString(13, cust.getPhone());
        System.out.print("邮箱(" + cust.getEmail() + "):");
        String email = CMUtility.readString(30, cust.getEmail());
        Customer newcust = new Customer(name, gender, age, phone, email);
        boolean isReplace = customerList.replaceCustomer(number - 1, newcust);
        if (isReplace) {
            System.out.println("----------------------修改成功----------------------");
        } else {
            System.out.println("----------------------修改失败----------------------");
        }
    }

    private void deleteCustomer() {
        System.out.println("----------------------删除客户信息----------------------");
        int number;
        for (; ; ) {
            System.out.print("选择删除客户编号(-1退出)");
            number = CMUtility.readInt();

            if (number == -1) {
                return;
            }

            Customer customer = customerList.getCustomer(number - 1);
            if (customer == null) {
                System.out.println("无法找到指定客户");
            } else {
                break;
            }
        }
        //找到指定客户
        System.out.println("是否要确认删除(Y/N):");
        char idDelete = CMUtility.readConfirmSelection();
        if (idDelete == 'Y') {
            boolean deleteSuccess = customerList.deleteCustomer(number - 1);
            if (deleteSuccess) {
                System.out.println("----------------------删除完成----------------------");
            } else {
                System.out.println("----------------------删除失败----------------------");
            }
        }

    }

    private void listAllCustomers() {
        //System.out.println("显示客户列表");
        System.out.println("---------------------客户列表--------------------");
        int total = customerList.getTotal();
        if (total == 0){
            System.out.println("没有客户记录");
        }else{
            System.out.println("编号\t姓名\t\t性别\t年龄\t电话\t\t\t邮箱");
            Customer [] custs = customerList.getAllCustomers();
            for (int i = 0; i < custs.length; i++) {
                Customer cust = custs[i];
                System.out.println((i+1) + "\t" + cust.getName() +
                        "\t" + cust.getGender() + "\t" + cust.getAge() +
                        "\t" +cust.getPhone() + "\t" + cust.getEmail());//这里必须用双引号的\t
            }
        }
        System.out.println("---------------------------客户列表完成-----------------------------");

    }

    public static void main(String[] args) {
        CustomerView view = new CustomerView();
        view.enterMainMenu();
    }
}
