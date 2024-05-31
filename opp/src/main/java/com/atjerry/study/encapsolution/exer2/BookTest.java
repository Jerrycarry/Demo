package com.atjerry.study.encapsolution.exer2;

/**
 * @BelongsProject: Demo
 * @BelongsPackage: com.atjerry.study.encapsolution.exer2
 * @Author: Jerry
 * @CreateTime: 2024-06-01  01:11
 * @Description: TODO
 * @Version: 1.0
 */

public class BookTest {
    public static void main(String[] args) {
        Book book = new Book();

        book.setBookName("追风筝的人");
        book.setAuthor("泊莫桑");
        book.setPrice(19.9);

        System.out.println(book.showInfo());
    }
}
