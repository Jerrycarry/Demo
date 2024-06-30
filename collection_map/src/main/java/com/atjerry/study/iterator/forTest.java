package com.atjerry.study.iterator;

import com.atjerry.study.Collection.Person;
import org.junit.Test;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Collection;

/**
 * @BelongsProject: Demo
 * @BelongsPackage: com.atjerry.study.iterator
 * @Author: Jerry
 * @CreateTime: 2024-06-30  17:06
 * @Description:
 * @Version: 1.0
 */

public class forTest {

    @Test
    public void test1(){
        Collection coll = new ArrayList();

        coll.add("AA");
        coll.add("AA");

        Person p1 = new Person("Tom",12);
        coll.add(p1);
        coll.add(128);
        coll.add("六六六 ");

        for (Object object : coll){
            System.out.println(object);
        }
    }

    @Test
    public void test2(){
        int[] arr = new int[]{1,2,3,4,5,6};

        for(int i:arr){
            System.out.println(i);
        }
    }

    //增强for循环
    @Test
    public void test3(){
        String[] arr1 = new String[]{"GG","DD","JJ","MM","SS"};
        for (String s:arr1){
            System.out.println(s);
        }

    }
}
