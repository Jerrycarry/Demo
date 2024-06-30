package com.atjerry.study.Collection;


import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * @BelongsProject: Demo
 * @BelongsPackage: com.atjerry.study.Collection
 * @Author: Jerry
 * @CreateTime: 2024-06-29  22:36
 * @Description:
 * @Version: 1.0
 */

public class CollectionTest {
    /**
     * (1)add(Object obj):添加元素对象到当前集合中
     * (2)addAll(Collection other):添加other集合中的所有元素对象到当前集合中,即this = this U other
     **/

    @Test
    public void test() {
        Collection coll = new ArrayList();

        //add()
        coll.add("AA");
        coll.add(123);//自动装箱
        coll.add("六六六");
        coll.add(new Object());
        coll.add(new Person("Tom", 123));

        System.out.println(coll);

        //addALL(Collection other)
        Collection coll1 = new ArrayList();
        coll1.add("BB");
        coll1.add(456);

        coll.addAll(coll1);
        System.out.println(coll);

    }

    @Test
    public void test2() {
        Collection coll = new ArrayList();

        //add()
        coll.add("AA");
        coll.add(128);
        coll.add("六六六");
        coll.add(new Person("Tom", 12));


        //isEmpty()判断集合是否为空
        System.out.println(coll.isEmpty());

        //contains()
        System.out.println(coll.contains("AA"));
        System.out.println(coll.contains(128));
        System.out.println(coll.contains(("六六六")));
        System.out.println(coll.contains(new Person("Tom", 12)));

    }

    @Test
    public void test3() {
        Collection coll = new ArrayList();
        coll.add("AA");
        coll.add("AA");
        Person p1 = new Person("Tom", 12);
        coll.add(p1);
        coll.add(128);
        coll.add("尚硅谷");

        //集合--->数组
        Object[] array = coll.toArray();
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.hashCode(array));
    }

    @Test
    public void test4() {
        //数组--->集合
        Integer[] arr = new Integer[]{1, 2, 3};//这是三个对象
        List list = Arrays.asList(arr);
        System.out.println(list.size());

        int[] arr1 = new int[]{1,2,3};//这是一个对象三个数据类型
        List list1 = Arrays.asList(arr1);
        System.out.println(list1.size());
    }
}
