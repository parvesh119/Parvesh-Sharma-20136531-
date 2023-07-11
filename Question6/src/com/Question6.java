package com;
import java.util.ArrayList;
import java.util.Scanner;

 

class Book {
    private int isbnno;
    private String bookName;
    private String author;

 

    public int getIsbnno() {
        return isbnno;
    }

 

    public void setIsbnno(int isbnno) {
        this.isbnno = isbnno;
    }

 

    public String getBookName() {
        return bookName;
    }

 

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

 

    public String getAuthor() {
        return author;
    }

 

    public void setAuthor(String author) {
        this.author = author;
    }
}

 

class Library {
    private ArrayList<Book> bookList = new ArrayList<>();

 

    public void addBook(Book bobj) {
        bookList.add(bobj);
    }

 

    public boolean isEmpty() {
        return bookList.isEmpty();
    }

 

    public ArrayList<Book> viewAllBooks() {
        return bookList;
    }
}

 

public class Question6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

 

        while (true) {
            System.out.println("1. Add Book");
            System.out.println("2. Display all book details");
            System.out.println("3. Search Book by author");
            System.out.println("4. Count number of books - by book name");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

 

       
        }
    }
}
