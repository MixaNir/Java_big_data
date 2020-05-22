package com.company;
import java.util.Date;

public class Main {

    public static void main(String[] args) { //Variant 10
        Cinema cinema = new Cinema();
        Cinema.CinemaTheater theater = cinema.new CinemaTheater(Cinema.Theater.KaroFilm, "Moscow, South Butovo");
        Cinema.Film film = cinema.new Film("Interstellar", "Awesome film",
                Cinema.Rating.PEGI12, "Christopher Nolan");
        Date date = new Date(1212121212121L);
        Cinema.Session session = cinema.new Session(date, film, theater, 450);
    }
}
