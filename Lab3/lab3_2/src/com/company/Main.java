package com.company;
import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) { //variant 7
	// write your code here
        Car[] cars = new Car[8];
        int n = 9;
        int price = 400000;

        for (int i = 0; i < cars.length; i++){
            if(cars[i].get_company() == "Skoda")
                System.out.println(cars[i].toString());
        }

        for (int i = 0; i < cars.length; i++){
            if(cars[i].get_model() == "Octavia" && (LocalDateTime.now().getYear()-n)>cars[i].get_cteationYear())
                System.out.println(cars[i].toString());
        }

        for (int i = 0; i < cars.length; i++){
            if(cars[i].get_cteationYear() == 2011 && cars[i].get_price()>price)
                System.out.println(cars[i].toString());
        }
    }
}
