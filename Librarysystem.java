import java.util.Scanner;

public class LibraryManagementSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            displayMenu();
            System.out.print("Enter your choice: ");
            option = scanner.nextInt();

            if (option == 1) {
                // Add book
                System.out.println("Adding a book...");
            } else if (option == 2) {
                // Remove book
                System.out.println("Removing a book...");
            } else if (option == 3) {
                // Display all books
                System.out.println("Displaying all books...");
            } else if (option == 4) {
                // Exit
                System.out.println("Exiting the system. Goodbye!");
            } else {
                System.out.println("Invalid choice. Please try again.");
            }

        } while (option != 4);

        scanner.close();
    }

    private static void displayMenu() {
        System.out.println("\nLibrary Management System Menu");
        System.out.println("1. Add Book");
        System.out.println("2. Remove Book");
        System.out.println("3. Display All Books");
        System.out.println("4. Exit");
    }
}
