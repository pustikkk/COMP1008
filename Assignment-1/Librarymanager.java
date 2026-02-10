import java.util.ArrayList;
import java.util.Scanner;


public class Librarymanager {
    // Storing books
    ArrayList<Book> books = new ArrayList<>();
    boolean exit = false;
    public void addBook() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the title of the book: ");
        String title = input.nextLine();
        System.out.println("Enter the author of the book: ");
        String author = input.nextLine();
        System.out.println("Enter ISBN number: ");
        String isbn = input.nextLine();
        Book book = new Book(title,author,isbn,true);
        books.add(book);

    }

    public void displayBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

}
