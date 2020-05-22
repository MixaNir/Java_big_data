package com.company;

import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {// variant 5
        String[] rent_var = new String[2];
        rent_var[0] = "subscription";
        rent_var[1] = "hall";
        List<Book> books = new ArrayList<>();
        books.add(new Book("One", "Main author", "available", null));
        List<Reader> readers = new ArrayList<>();
        readers.add(new Reader("Mikhail", "Prokopenko", 123456, "done"));
        Library lib = new Library(books, readers);
        lib.add_order(readers.get(0), books.get(0), rent_var[1]);
        System.out.println(books.get(0).get_reader().get_name() + " get " + books.get(0).get_name() + " status: " + books.get(0).get_status());
        lib.return_book(readers.get(0), books.get(0));
        System.out.println(books.get(0).get_name() + " was returned, status: " + books.get(0).get_status());
        lib.add_reader_to_blackList(readers.get(0));
        System.out.println(readers.get(0).get_name() + " was banned, status: " + readers.get(0).get_status());
    }
}
