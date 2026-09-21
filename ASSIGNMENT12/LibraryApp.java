import library.Book;
public class LibraryApp {
    public static void main(String[] args) {
        Book b1 = new Book(1001, "Your Book Title", "Author Name", 400.0);
        b1.displayBookInfo();
        System.out.println();

        Book b2 = new Book(1002, "Another Book", "Another Author", 600.0);
        b2.displayBookInfo();
    }
}