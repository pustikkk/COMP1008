// Added package to have multiple main classes in one repo
package Assignment1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Librarymanager library = new Librarymanager();
        Scanner input = new Scanner(System.in);
        while (!library.wantExit) {
            System.out.println("Welcome to our library!");
            System.out.println("What would you like to choose? (Enter a number of your choice):");
            System.out.println("1. Add a book");
            System.out.println("2. Display all books in the library");
            System.out.println("3. Display all available books");
            System.out.println("4. Search a book by author");
            System.out.println("5. Check out the book");
            System.out.println("6. Return a book");
            System.out.println("7. Exit");
            System.out.println();
            int choice;
            try {
                // created a choice int variable so it's easier to track what a user wants, also used try catch for validation
                 choice = Integer.parseInt(input.nextLine());
            } catch (NumberFormatException e)  {
                System.out.println("You've entered invalid number, try again!");
                continue;
            }

            switch(choice) {
                case 1:
                    library.addBook();
                    continue;
                case 2:
                    library.displayBooks();
                    continue;
                case 3:
                    library.displayAvailableBooks();
                    continue;
                case 4:
                    System.out.println("Enter author's name: ");
                    library.searchByAuthor(input.nextLine());
                    continue;
                case 5:
                    System.out.println("Enter the title of the book which you would like to check out: ");
                    boolean hasCheckedOut = library.checkOutBook(input.nextLine());
                    if (hasCheckedOut) {
                        System.out.println("You've successfully got the book");
                    } else {
                        System.out.println("You've entered wrong title of the book");
                    }
                    continue;
                case 6:
                    System.out.println("Enter the title of the book which you would like to check out: ");
                    boolean hasReturned = library.returnBook(input.nextLine());
                    if (hasReturned) {
                        System.out.println("You've successfully returned the book");
                    } else {
                        System.out.println("You've entered wrong title of the book");
                    }
                    continue;
                case 7:
                    System.out.println("It was pleasure to serve you in our library! Have a good day and hope to see you again!");
                    library.exit();

            }

        }
    }
}
