import java.util.Scanner;

class Book {
    String nameOfBook;
    String authorFirstName;
    String authorLastName;
    String genre;
    String ISBN;
    String publishdate;
    double price;
}

class Library {
//adds more methods and variable by adding and removing books for checkouts and returns
    String[] customerArray;
    String date;
    boolean inStock;
    Book[] Books;
}

class Person {
    String firstName;
    String lastName;
    String address;
    String emailAddress;
    String phoneNumber;

    Person(String firstName, String lastName, String address, String emailAddress, String phoneNumber;)
}

    String getTitle(String identifier) {
        for (Book book : Books) {
            if (book.ISBN == identifier) {
                return book.nameOfBook;
            }
        }
        return "Did not find book";
        // if can't find it, return "Can't find it"
        // else return the nameOfBook from Book class

    }

    void AddNewBook(Book newBook) {

    }

    void RemoveFromInvetory(String ISBN) {

    }

    boolean OrderNewBook() {

    }

    void StockBook() {

    }

    String CheckoutMethod();

    public static void main(String[] args) {
        Library myLib = new Library();
        myLib.addNewBook(new Book));
        myLib.removeFromInventory();
    }

}
