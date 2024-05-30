package com.atjerry.study.common_algorithm;

/**
 * @BelongsProject: Demo
 * @BelongsPackage: com.atjerry.study.common_algorithm
 * @Author: Jerry
 * @CreateTime: 2024-05-19  23:51
 * @Description: TODO
 * @Version: 1.0
 */
/*

 */
public class YangHuiExer {
    public static void main(String[] args) {
        //1.创建二维数组
        int[][] yangHui = new int[10][];

        //通过循环结构,初始化外层数组元素
        for (int i = 0; i < yangHui.length; i++) {
            yangHui[i] = new int[i + 1];
            //给元素赋值
            //3.1给数组每行的首末元素赋值为1
            yangHui[i][0] = yangHui[i][i] = 1;

            for (int j = 1; j < yangHui[i].length - 1; j++) {
                yangHui[i][j] = yangHui[i - 1][j] + yangHui[i - 1][j - 1];
            }
        }

        //给数组每行的非首末元素赋值
        //遍历二维数组
        for (int i = 0; i < yangHui.length; i++) {
            for (int j = 0; j < yangHui[i].length; j++) {
                System.out.print(yangHui[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
