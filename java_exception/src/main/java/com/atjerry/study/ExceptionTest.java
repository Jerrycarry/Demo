package com.atjerry.study;



import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

/**
 * @BelongsProject: Demo
 * @BelongsPackage: com.atjerry.study
 * @Author: Jerry
 * @CreateTime: 2024-06-16  18:43
 * @Description:
 * @Version: 1.0
 */

public class ExceptionTest {

    @Test
    public void test1(){//ArrayIndexOutOfBoundsException
        int[] arr = new int[10];
        System.out.println(arr[10]);
    }

    @Test
    public void test2(){//NullPointerException
        String str = "str";
        str = null;
        System.out.println(str.toString());

        int arr[] = new int[10];
        arr = null;
        System.out.println(arr[0]);

        int[][] arr1 = new int[10][];
        System.out.println(arr1[0][0]);
    }

    @Test
    public void test3(){//ClassCastException
        Object object = new String();
        //String str = (String) object;
        Date date = (Date) object;
    }

    @Test
    public void test4(){//NumberFormatException
        String str = "123";
        str = "abc";
        int i = Integer.parseInt(str);
    }

    @Test
    public void test5(){//InputMismatchException
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(num);
    }

    @Test
    public void test6(){//ArithmeticException
        int num = 10;
        System.out.println(num/0);
    }


    //****************************************以上是运行时异常,以下是运行时异常***************************************

    @Test
    public void test7(){//ClassNotFoundException
       /* Class clz = Class.forName("java.lang.String");*/
    }

    @Test
    public void test8() throws FileNotFoundException, IOException {//FileNotFoundException、IOException
        File file = new File("D:\\hello.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        int data = fileInputStream.read();
        while (data != -1){
            System.out.print((char) data);
            data = fileInputStream.read();
        }
        fileInputStream.close();


    }


}

