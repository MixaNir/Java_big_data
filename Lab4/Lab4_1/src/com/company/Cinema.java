package com.company;
import java.util.Date;

public class Cinema {
    public enum Theater{
        KaroFilm,
        CinemaStar,
        CinemaPark
    }
    public enum Rating{
        PEGI3,
        PEGI7,
        PEGI12,
        PEGI16,
        PEGI18
    }
    public class CinemaTheater{
        public Theater name;
        public String adress;

        public CinemaTheater(){}
        public CinemaTheater(Theater theater, String adress){
            this.name = theater;
            this.adress = adress;
        }
    }
    public class Film{
        public String name;
        public String description;
        public Rating rate;
        public String producer;

        public Film(){}
        public Film(String name, String desc, Rating rate, String prod){
            this.name = name;
            this.description = desc;
            this.rate = rate;
            this.producer = prod;
        }
    }
    public class Session{
        public Date date;
        public Film film;
        public CinemaTheater theater;
        public int cost;

        public Session(){}
        public Session(Date date, Film film, CinemaTheater theater, int cost){
            this.date = date;
            this.film = film;
            this.theater = theater;
            this.cost = cost;
        }
    }
    public Cinema(){}
}
