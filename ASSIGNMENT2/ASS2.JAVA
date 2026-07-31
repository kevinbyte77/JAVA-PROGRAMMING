public class Book {
    String title;
    String author;
    double price;

    // Default constructor
    public Book() {
        title = "Unknown";
        author = "Unknown";
        price = 0.0;
    }

    // Parameterized constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Copy constructor
    public Book(Book other) {
        this.title = other.title;
        this.author = other.author;
        this.price = other.price;
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        // Using default constructor
        Book b1 = new Book();
        System.out.println("---- Book 1 (Default) ----");
        b1.display();

        System.out.println();

        // Using parameterized constructor
        Book b2 = new Book("Java Basics", "Kevin", 350.0);
        System.out.println("---- Book 2 (Parameterized) ----");
        b2.display();

        System.out.println();

        // Using copy constructor
        Book b3 = new Book(b2);
        System.out.println("---- Book 3 (Copy of Book 2) ----");
        b3.display();
    }
}