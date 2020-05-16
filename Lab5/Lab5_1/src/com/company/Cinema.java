package com.company;
import java.util.Date;
import java.util.InputMismatchException;

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
            try {
                this.name = theater;
            }
            catch (InputMismatchException e) {
                System.out.println("You need select theater from list");
            }

            try {
                this.adress = adress;
            }
            catch (InputMismatchException e) {
                System.out.println("Adress must be string type");
            }
        }
    }
    public class Film{
        public String name;
        public String description;
        public Rating rate;
        public String producer;

        public Film(){}
        public Film(String name, String desc, Rating rate, String prod){
            try {
                this.name = name;
            }
            catch (InputMismatchException e) {
                System.out.println("Film name must be string type");
            }
            try {
                this.description = desc;
            }
            catch (InputMismatchException e) {
                System.out.println("Film description must be string type");
            }
            try {
                this.rate = rate;
            }
            catch (InputMismatchException e) {
                System.out.println("You need select rating from list");
            }
            try {
                this.producer = prod;
            }
            catch (InputMismatchException e) {
                System.out.println("Film producer must be string type");
            }
        }
    }
    public class Session{
        public Date date;
        public Film film;
        public CinemaTheater theater;
        public int cost;

        public Session(){}
        public Session(Date date, Film film, CinemaTheater theater, int cost){
            try {
                this.date = date;
            }
            catch (InputMismatchException e) {
                System.out.println("You must using class Date to create session date");
            }
            try {
                this.film = film;
            }
            catch (InputMismatchException e) {
                System.out.println("You need select film from existing films");
            }
            try {
                this.theater = theater;
            }
            catch (InputMismatchException e) {
                System.out.println("You need select theater from existing theaters");
            }
            try {
                this.cost = cost;
            }
            catch (InputMismatchException e) {
                System.out.println("Session cost must be integer type");
            }
        }
    }

    public Cinema(){}


}
