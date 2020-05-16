package com.company;
import java.util.Date;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {

    public static void main(String[] args) { //Variant
        // write your code here
        Scanner ob = new Scanner(System.in);
        Cinema cinema = new Cinema();

        String adress = "";
        System.out.println("Input theater adress: ");
        try {
            adress = ob.nextLine();
        }
        catch (InputMismatchException e) {
            System.out.println("Adress must be string type");
        }

        String name = "";
        System.out.println("Input film name: ");
        try {
            name = ob.nextLine();
        }
        catch (InputMismatchException e) {
            System.out.println("Film name must be string type");
        }

        int cost = 0;
        System.out.println("Input session cost: ");
        try {
            cost = ob.nextInt();
        }
        catch (InputMismatchException e) {
            System.out.println("Session cost must be integer type");
        }
        Cinema.CinemaTheater theater = cinema.new CinemaTheater(Cinema.Theater.KaroFilm, adress);
        Cinema.Film film = cinema.new Film(name, "Awesome film", Cinema.Rating.PEGI12, "Christopher Nolan");
        Date date = new Date(1212121212121L);
        Cinema.Session session = cinema.new Session(date, film, theater, cost);
    }
}
