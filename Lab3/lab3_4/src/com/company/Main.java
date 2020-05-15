package com.company;

import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {// variant 5
	// write your code here
        String[] rent_var = new String[2];
        rent_var[0] = "subscription";
        rent_var[1] = "hall";
        List<Book> books = new ArrayList<>();
        List<Reader> readers = new ArrayList<>();
        Library lib = new Library(books, readers);
        lib.add_order(readers.get(0), books.get(0), rent_var[1]);
        lib.return_book(readers.get(0), books.get(0));
        lib.add_reader_to_blackList(readers.get(1));
    }
}
