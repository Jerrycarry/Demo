package com.atjerry.study.method_more.recursion;

/**
 * @BelongsProject: Demo
 * @BelongsPackage: com.atjerry.study.method_more.recursion
 * @Author: Jerry
 * @CreateTime: 2024-05-30  21:38
 * @Description: TODO
 * @Version: 1.0
 */

/*
递归 栈溢出错误
 */
public class RecursionTest {

    public static void main(String args[]) {
        RecursionTest recursionTest = new RecursionTest();

        //recursionTest.method1();

        System.out.println(recursionTest.getSum(100));
        System.out.println(recursionTest.getSum1(100));

        int n = 5;
        System.out.println(recursionTest.getMul(5));

        int m = 10;
        System.out.println(recursionTest.f(10));
    }

    /*
    举例1:计算 1-100自然数的总和
     */

    public int getSum(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            sum += i;
        }
        return sum;
    }

    /*
    举例2: 计算n！
     */
    public int getMul(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * getMul(n - 1);
        }
    }

    /*
    举例5: 裴波那契数列
     */

    public int f(int n){
        if (n ==1){
            return 1;
        }else if (n ==2){
            return 1;
        }else {
            return f(n-1)+f(n-2);
        }
    }

    public int getSum1(int num) {
        if (num == 1) {
            return 1;
        } else {
            return getSum1(num - 1) + num;
        }
    }

    /*
    如下递归方法的调用,会导致StackOverError。
     */
    public void method1() {
        System.out.println("method1......");
        method1();
    }
}
