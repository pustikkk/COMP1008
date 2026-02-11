import java.util.ArrayList;
import java.util.Scanner;


public class Librarymanager {
    // Storing books

    public Librarymanager() {
        // filling in the library to test
        books.add(new Book("1984", "George Orwell", "9780451524935", true));
        books.add(new Book("To Kill a Mockingbird", "Harper Lee", "9780061120084", false));
        books.add(new Book("The Great Gatsby", "F. Scott Fitzgerald", "9780743273565", true));
        books.add(new Book("Harry Potter and the Sorcerer's Stone", "J.K. Rowling", "9780590353427", true));
        books.add(new Book("The Catcher in the Rye", "J.D. Salinger", "9780316769488", false));
        addBook();
    }
    ArrayList<Book> books = new ArrayList<>();
    boolean wantExit = false;


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
                System.out.println("Title: " + book.getTitle());
                System.out.println("Author: " + book.getAuthor());
                System.out.println("ISBN number: " + book.getIsbn());
            }
        }
        System.out.println("Checked out books:");
        for (Book book : books) {
            if (!(book.isAvailable())) {
                System.out.println("Title: " + book.getTitle());
                System.out.println("Author: " + book.getAuthor());
                System.out.println("ISBN number: " + book.getIsbn());
            }
        }
    }
    public void displayAvailableBooks() {
        for (Book book : books) {
            if (book.isAvailable()) {
                System.out.println("Title: " + book.getTitle());
                System.out.println("Author: " + book.getAuthor());
                System.out.println("ISBN number: " + book.getIsbn());
            }
        }
    }

    public void checkOutBook(Book book) {
        book.setAvailable(false);
    }
    public void returnBook(Book book) {
        book.setAvailable(true);
    }

    public void searchByAuthor(String author) {
        for (Book book : books) {
            if(book.getAuthor().equalsIgnoreCase(author)) {
                System.out.println("Found it!");
                System.out.println("Title: " + book.getTitle());
                System.out.println("Author: " + book.getAuthor());
                System.out.println("ISBN number: " + book.getIsbn());
                if(book.isAvailable()) {
                    System.out.println("This book is available");
                } else {
                    System.out.println("Unfortunately this book is unavailable right now");
                }
            }
        }
    }

    public void exit() {
        wantExit = true;
    }

}
