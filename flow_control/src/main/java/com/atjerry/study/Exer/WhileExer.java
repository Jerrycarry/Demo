package com.atjerry.study.Exer;



import java.util.Scanner;

/**
 * @BelongsProject: Demo
 * @BelongsPackage: com.atjerry.study.Exer
 * @Author: Jerry
 * @CreateTime: 2024-05-17  22:43
 * @Description: TODO
 * @Version: 1.0
 */
/*
随机生成一个100以内的数，猜这个随机数是多少？
从键盘输入数，如果大了，提示大了；如果小了，提示小了：如果对了，就不再猜了，并统计一共猜了多少次
提示：生成一个[a,b]范围的随机数的方式：(int)(Math.random(()*(b-a+1)+a)
 */
public class WhileExer {
    public static void main(String[] args) {
         //1.生成一个[0,100]范围以内的随机整数。
        int random = (int)(Math.random() * 100) + 1;
         //2.使用Scanner,从键盘获取整数。
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入1-100以内的整数:");
        int guess = scanner.nextInt();
        int guessCount = 1;
        while (random != guess){
            if (random > guess){
                System.out.println("很抱歉,猜小了");
            }else if (random < guess){
                System.out.println("很抱歉,猜大了");
            }else {
                System.out.println("恭喜您,猜对了");
            }
            System.out.println("请输入1-100以内的整数:");
            guess = scanner.nextInt();
            guessCount++;
        }
        System.out.println("总共猜了" + guessCount + "次！");

    }
}
