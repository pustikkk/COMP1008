package Assignment1;

public class Book {
    private String title;
    private String author;
    private String isbn;
    private boolean available;


    // Default constructor
    public Book() {
        this.title = "Untitled";
        this.author = "Unknown";
        this.isbn = "0000000000";
        this.available = false;
    }

    // Parameterized constructor
    public Book(String title, String author, String isbn, boolean available) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.available = available;
    }


    // Simple getters
    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getIsbn() {
        return this.isbn;
    }

    public boolean isAvailable() {
        return this.available;
    }

    // Simple setters
    public boolean setTitle(String title) {
        if(!(title.isBlank())) {
            this.title = title;
            System.out.println("You successfully changed title to " + title);
            return true;
        } else {
            // if it is invalid title returns false
            System.out.println("You entered invalid title");
            return false;
        }
    }

    public boolean setAuthor(String author) {
        if(!(author.isBlank())) {
            this.author = author;
            System.out.println("You successfully changed author's name to " + author);
            return true;
        } else {
            System.out.println("You entered invalid author's name");
            return false;
        }
    }

    public boolean setIsbn(String isbn) {
        if(isbn.length() == 10 || isbn.length() == 13) {
            this.isbn = isbn;
            System.out.println("You successfully changed isbn number to " + isbn);
            return true;
        } else {
            System.out.println("You entered invalid isbn number");
            return false;
        }
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN number: " + isbn);
        if (available) System.out.println("The book is available");
        else System.out.println("Currently the book is not available. Try again later.");
    }

}
