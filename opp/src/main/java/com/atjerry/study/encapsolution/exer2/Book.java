package com.atjerry.study.encapsolution.exer2;

/**
 * @BelongsProject: Demo
 * @BelongsPackage: com.atjerry.study.encapsolution.exer2
 * @Author: Jerry
 * @CreateTime: 2024-06-01  01:04
 * @Description: TODO
 * @Version: 1.0
 */

public class Book {

    //书名
    private String bookName;
    //作者
    private String author;
    //价格
    private double price;

    public void setBookName(String bn){
        bookName = bn;
    }

    public void setAuthor(String au){
        author = au;
    }

    public void setPrice(double pr){
        price = pr;
    }

    public String getBookName(){
        return bookName;
    }

    public String getAuthor(){
        return author;
    }

    public double getPrice(){
        return price;
    }

    //获取图书信息
    public String showInfo(){
        return "bookName=" + bookName + "author=" + author + "price=" + price;
    }
}
