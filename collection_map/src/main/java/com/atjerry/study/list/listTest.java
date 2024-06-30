package com.atjerry.study.list;

import com.atjerry.study.set.Person;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @BelongsProject: Demo
 * @BelongsPackage: com.atjerry.study.list
 * @Author: Jerry
 * @CreateTime: 2024-06-30  18:51
 * @Description:
 * @Version: 1.0
 */

public class listTest{


    @Test
    public void test1(){

        List list = new ArrayList();
        //add(Object obj)
        list.add("AA");
        list.add(123);
        list.add("BB");
        list.add(new Person("Tom",12));

        System.out.println(list);
        //add(int index,Object ele)
        list.add(2,"CC");
        System.out.println(list);

        List list1 = Arrays.asList(1,2,3);

        //list.addAll(1,list1);
        list.add(1,list1);
        System.out.println(list);
    }

    @Test
    public void test2(){
        List list = new ArrayList();
        //add(Object obj)
        list.add("AA");
        list.add(123);
        list.add("BB");
        list.add(new Person("Tom",12));

        //remove()删除指定索引上的元素
        list.remove(2);
        System.out.println(list.get(2));

        //删除数据2
        list.remove(Integer.valueOf(2));
        System.out.println(list);
    }

    @Test
    public void test3(){
        List list = new ArrayList();
        //add(Object obj)
        list.add("AA");
        list.add(123);
        list.add("BB");
        list.add(new Person("Tom",12));

        //遍历方式1：使用iterator
        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //遍历方式2：增强for循环
        for (Object obj : list){
            System.out.println(obj);
        }

        //遍历方式3：
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
