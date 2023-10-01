import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class Book {
    String nameOfBook;
    String authorFirstName;
    String authorLastName;
    String genre;
    String ISBN;
    String publishDate;
    double price;

    // Constructor for Book class
    public Book(String nameOfBook, String authorFirstName, String authorLastName,
                String genre, String ISBN, String publishDate, double price) {
        this.nameOfBook = nameOfBook;
        this.authorFirstName = authorFirstName;
        this.authorLastName = authorLastName;
        this.genre = genre;
        this.ISBN = ISBN;
        this.publishDate = publishDate;
        this.price = price;
    }
}

class Library {
    // library class
    String[] customerArray;
    String date;
    boolean inStock;
    Book[] books;

    // Constructor for Library class
    public Library() {
        // Initialize the books array or other variables if needed
    }

    void addNewBook(Book newBook) {
        System.out.println(newBook.nameOfBook + " " + newBook.authorFirstName + " " + newBook.authorLastName + " " + newBook.ISBN);

        // Adding a new book to the library
    }

    void removeFromInventory(String ISBN) {
        // Removing a book from the library's inventory
    }

    boolean orderNewBook() {
        // Ordering a new book for the library
        return false; // Change the return value as needed
    }

    void stockBook() {
        // Stocking a book in the library
    }

    String checkoutMethod() {
        // The checkout process
        return ""; // Return Book Name
    }
}

class Person {
    String firstName;
    String lastName;
    String address;
    String emailAddress;
    String phoneNumber;

    // Constructor for Person class
    public Person(String firstName, String lastName, String address, String emailAddress, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
    }
}

public class Libraryinclass {
    public static void main(String[] args) {
        Library myLib = new Library();
        Book newBook = new Book("The Life of Joe Montana", "Keith", "Dunnavant", "Sports", "ISBN1035564899", "2016-11-01", 15.05);
Book newBook2 = new Book("NFL Legends", "Ross", "Hamilton", "Sports", "ISBN1314067604", "2021-02-01", 26.95);
Book newBook3 = new Book("The 1978 Pittsburgh Steelers", "Sal", "Maiorana", "Sports", "ISBN1434867790", "2009-09-01", 29.99);
Book newBook4 = new Book("Bills Mafia", "Scott", "Pitoniak", "Sports", "ISBN1477960231", "2023-09-13", 29.99); 
        myLib.addNewBook(newBook);
        myLib.addNewBook(newBook2);
        myLib.addNewBook(newBook3);
        myLib.addNewBook(newBook4);
        myLib.removeFromInventory("ISBN1234567890");
    }
}
