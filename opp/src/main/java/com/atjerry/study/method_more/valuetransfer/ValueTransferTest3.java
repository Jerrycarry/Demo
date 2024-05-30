package com.atjerry.study.method_more.valuetransfer;

/**
 * @BelongsProject: Demo
 * @BelongsPackage: com.atjerry.study.method_more.valuetransfer
 * @Author: Jerry
 * @CreateTime: 2024-05-28  21:27
 * @Description: TODO
 * @Version: 1.0
 */

public class ValueTransferTest3 {
    public static void main(String[] args) {

        ValueTransferTest3 test3 = new ValueTransferTest3();

        int m = 10;
        int n = 20;

        System.out.println("m =" + m + "n =" + n);

        test3.swap(m,n);

        System.out.println("m =" + m + "n =" + n);

    }

    public void swap(int m,int n){
        int temp = m;
        m = n;
        n = temp;
    }
}
