package com.company;

public class Reader {
    private String name;
    private String surname;
    private int subscription;
    private String status;

    public Reader(){}
    public Reader(String name, String surname, int num, String status){
        this.name = name;
        this.surname = surname;
        this.subscription = num;
        this.status = status;
    }
    public Reader(Reader extend){
        this.name = extend.name;
        this.surname = extend.surname;
        this.subscription = extend.subscription;
        this.status = extend.status;
    }

    public void set_name(String name){this.name = name;}
    public void set_surname(String surname){this.surname = surname;}
    public void set_subscription(int num){this.subscription = num;}
    public void set_status(String status){this.status = status;}

    public String get_name(){return this.name;}
    public String get_surmane(){return this.surname;}
    public int get_subscription(){return this.subscription;}
    public String get_status(){return this.status;}
}
