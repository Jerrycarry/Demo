package com.atjerry.study.set;

import org.junit.Test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @BelongsProject: Demo
 * @BelongsPackage: com.atjerry.study.set
 * @Author: Jerry
 * @CreateTime: 2024-06-30  22:53
 * @Description:
 * @Version: 1.0
 */

public class SetTest {

    public static void main(String[] args) {


    }

    @Test
    public void test1(){
        Set set = new HashSet<>();

        set.add("AA");
        set.add(123);
        set.add("BB");
        set.add(new Person("Tom",23));

        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println(set.contains(new Person("Tom",23)));
    }

    @Test
    public void test2(){
        Set set = new LinkedHashSet();

        set.add("AA");
        set.add(123);
        set.add("BB");
        set.add(new Person("Tom",23));

        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println(set.contains(new Person("Tom",23)));
    }
}
