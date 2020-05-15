package com.company;
import java.util.Random;

public class Car {
    private int id;
    private String company;
    private String model;
    private int creationYear;
    private String color;
    private int price;
    private String label;

    public Car(){}
    public Car(String producer, String mdl, int year, String clr, int cost, String lbl){
        setup(producer, mdl, year, clr, cost, lbl);
    }
    public Car(Car car){
        setup(car.company, car.model, car.creationYear, car.color, car.price, car.label);
    }

    private void setup(String producer, String mdl, int year, String clr, int cost, String lbl){
        Random random = new Random();
        this.id = random.nextInt(100);
        this.company = producer;
        this.model = mdl;
        this.creationYear = year;
        this.color = clr;
        this.price = cost;
        this.label = lbl;
    }

    public void set_company(String producer){this.company = producer;}
    public void set_model(String mdl){this.model = mdl;}
    public void set_cteationYear(int year){this.creationYear = year;}
    public void set_color(String clr){this.color = clr;}
    public void set_price(int cost){this.price = cost;}
    public void set_label(String lbl){this.label = lbl;}

    public String get_company(){return  this.company;}
    public String get_model(){return  this.model;}
    public int get_cteationYear(){return  this.creationYear;}
    public String get_color(){return  this.color;}
    public int get_price(){return  this.price;}
    public String get_label(){return  this.label;}

    public String toString(){
        return "Croduced by: " + this.company +
                ", model: " + this.model +
                ", year of creation: " + Integer.toString(this.creationYear) +
                ", color: " + this.color +
                ", price: " + Integer.toString(this.price) +
                ", register sign: " + this.label;
    }

}
