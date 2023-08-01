package encapsulation_abstraction;

class Author {
    private String name;
    private String email;
    private char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }
}

class Book {
    private String name;
    private Author author;
    private double price;
    private int qtyInStock;

    public Book(String name, Author author, double price, int qtyInStock) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qtyInStock = qtyInStock;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getQtyInStock() {
        return qtyInStock;
    }
}

public class Q1 {
    public static void main(String[] args) {
        // Create an author object
        Author author = new Author("John Doe", "johndoe@example.com", 'M');

        // Create a book object
        Book book = new Book("Sample Book", author, 29.99, 10);

        // Print the details of the book, including author details
        System.out.println("Book Details:");
        System.out.println("Title: " + book.getName());
        System.out.println("Author: " + book.getAuthor().getName());
        System.out.println("Email: " + book.getAuthor().getEmail());
        System.out.println("Gender: " + book.getAuthor().getGender());
        System.out.println("Price: $" + book.getPrice());
        System.out.println("Quantity in Stock: " + book.getQtyInStock());
    }
}
