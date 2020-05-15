package com.company;
import java.util.List;

public class Library {
    private List<Book> bookList;
    private List<Reader> readers;

    public Library(){}
    public Library(List<Book> books, List<Reader> readers){
        this.bookList = books;
        this.readers = readers;
    }
    public Library(Library extend){
        this.bookList = extend.bookList;
        this.readers = extend.readers;
    }

    public void set_bookList(List<Book> books){this.bookList = books;}
    public void set_readers(List<Reader> readers){this.readers = readers;}

    public List<Book> get_bookList(){return this.bookList;}
    public List<Reader> get_readers(){return this.readers;}

    public void add_order(Reader reader, Book book, String status){
        int bookIndex = bookList.indexOf(book);
        int readerIndex = readers.indexOf(reader);
        if(bookIndex != -1){
            if(readerIndex != -1){
                if(bookList.get(bookIndex).get_status() == "available" && readers.get(readerIndex).get_status() != "ban"){
                    bookList.get(bookIndex).set_status(status);
                    bookList.get(bookIndex).set_user(reader);
                }
            }
        }
    }

    public void add_reader_to_blackList(Reader reader){
        int readerIndex = readers.indexOf(reader);
        if(readerIndex != -1){
            readers.get(readerIndex).set_status("ban");
        }
    }

    public void return_book(Reader reader, Book book){
        int bookIndex = bookList.indexOf(book);
        int readerIndex = readers.indexOf(reader);
        if(bookIndex != -1){
            if(readerIndex != -1){
                bookList.get(bookIndex).set_status("available");
                bookList.get(bookIndex).set_user(null);
            }
        }
    }
}
