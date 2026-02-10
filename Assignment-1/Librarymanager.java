import java.util.ArrayList;
import java.util.Scanner;


public class Librarymanager {
    // Storing books

    public Librarymanager() {
        addBook();
    }
    ArrayList<Book> books = new ArrayList<>();


    public void addBook() {
        Book book = new Book();
        boolean isInputValid = false;
        Scanner input = new Scanner(System.in);

        // validates user input, if it is wrong, then asks again
        while(!isInputValid) {
            System.out.println("Enter the title of the book: ");
            String title = input.nextLine();
            if (book.setTitle(title)) {
                isInputValid = true;
            }
        }

        isInputValid = false;
        while (!isInputValid) {
            System.out.println("Enter the author of the book: ");
            String author = input.nextLine();
            if(book.setAuthor(author)) {
                isInputValid = true;
            }
        }

        isInputValid = false;
        while (!isInputValid) {
            System.out.println("Enter ISBN number: ");
            String isbn = input.nextLine();
            if(book.setIsbn(isbn)) {
                isInputValid = true;
            }
        }
        // availability is true by default
        book.setAvailable(true);

        books.add(book);

    }

    public void displayBooks() {
        System.out.println("Available books:");
        for (Book book : books) {
            if (book.isAvailable()) {
                System.out.println(book);
            }
        }
        System.out.println("Checked out books:");
        for (Book book : books) {
            if (!(book.isAvailable())) {
                System.out.println(book);
            }
        }
    }
    public void displayAvailableBooks() {
        for (Book book : books) {
            if (book.isAvailable()) {
                System.out.println(book);
            }
        }
    }

    public void checkOutBook(Book book) {
        book.setAvailable(false);
    }
    public void returnBook(Book book) {
        book.setAvailable(true);
    }

    public boolean exit(boolean exit) {
        return exit;
    }

}
