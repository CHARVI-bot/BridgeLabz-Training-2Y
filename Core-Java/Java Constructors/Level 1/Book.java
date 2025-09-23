public class Book {
    private String title;
    private String author;
    private double price;

    public Book() {
        this.title = "Unknown Title";
        this.author = "Unknown Author";
        this.price = 0.0;
    }

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Book Details:");
        System.out.println("Title : " + title);
        System.out.println("Author: " + author);
        System.out.println("Price : ₹" + price);
    }

    public static void main(String[] args) {
        Book defaultBook = new Book();
        Book customBook = new Book("Wings of Fire", "A.P.J. Abdul Kalam", 299.99);

        defaultBook.displayDetails();
        System.out.println();
        customBook.displayDetails();
    }
}