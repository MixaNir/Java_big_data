package com.company;

public class Book {
    private String name;
    private String author;
    private String status;
    private Reader user;

    public Book(){}
    public Book(String name, String author, String status, Reader user){
        this.author = author;
        this.name = name;
        this.status = status;
        this.user = user;
    }
    public Book(Book extend){
        this.author = extend.author;
        this.name = extend.name;
        this.status = extend.status;
        this.user = extend.user;
    }

    public void set_name(String name){this.name = name;}
    public void set_author(String author){this.author = author;}
    public void set_status(String status){this.status = status;}
    public void set_user(Reader user){this.user = user;}

    public String get_name(){return this.name;}
    public String get_author(){return this.author;}
    public String get_status(){return this.status;}
    public Reader get_reader(){return this.user;}
}
