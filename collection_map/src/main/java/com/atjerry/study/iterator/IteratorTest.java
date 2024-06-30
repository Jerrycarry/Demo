package com.atjerry.study.iterator;

import com.atjerry.study.Collection.Person;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @BelongsProject: Demo
 * @BelongsPackage: com.atjerry.study.iterator
 * @Author: Jerry
 * @CreateTime: 2024-06-30  16:10
 * @Description:
 * @Version: 1.0
 */

public class IteratorTest {
    @Test
    public void test1(){
        Collection coll = new ArrayList();

        coll.add("AA");
        coll.add("AA");

        Person p1 = new Person("Tom",12);
        coll.add(p1);
        coll.add(128);
        coll.add("六六六 ");

        //获取迭代器对象
        Iterator iterator = coll.iterator();
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());


        while(iterator.hasNext()){
            System.out.println(iterator.next());
        };

    }
}
