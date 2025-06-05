package pgm04;

// File: BookStore.java

class Book {
    String bookname;
    String author;
    String publisher;
    double price;
    int yearOfPublished;

    // Constructor to initialize all values
    public Book(String bookname, String author, String publisher, double price, int yearOfPublished) {
        this.bookname = bookname;
        this.author = author;
        this.publisher = publisher;
        this.price = price;
        this.yearOfPublished = yearOfPublished;
    }

    // Method to display book details
    public void display() {
        System.out.println("Book Name: " + bookname);
        System.out.println("Author: " + author);
        System.out.println("Publisher: " + publisher);
        System.out.println("Price: ₹" + price);
        System.out.println("Year of Published: " + yearOfPublished);
    }
}

class Book_Sales {
    String saler_name;
    int number_of_sales;
    int saler_id;

    // Constructor to initialize sales data
    public Book_Sales(String saler_name, int number_of_sales, int saler_id) {
        this.saler_name = saler_name;
        this.number_of_sales = number_of_sales;
        this.saler_id = saler_id;
    }

    // Method to display sales info
    public void displaySalesInfo() {
        System.out.println("Saler Name: " + saler_name);
        System.out.println("Number of Sales: " + number_of_sales);
        System.out.println("Saler ID: " + saler_id);
    }
}

public class BookStore {
    public static void main(String[] args) {
        // Book instance
        Book book = new Book("Effective Java", "Joshua Bloch", "Addison-Wesley", 599.99, 2018);
        book.display();

        System.out.println();

        // Book_Sales instance
        Book_Sales sales = new Book_Sales("Alice Johnson", 150, 2001);
        sales.displaySalesInfo();
    }
}
