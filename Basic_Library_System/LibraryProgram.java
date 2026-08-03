import java.util.InputMismatchException;
import java.util.Scanner;

public class LibraryProgram {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Inventory inventory = new Inventory();

        int choice = 0;

        while (choice != 6) {

            System.out.println("\n===== Library Menu =====");
            System.out.println("1. Add Book");
            System.out.println("2. Borrow Book");
            System.out.println("3. Return Book");
            System.out.println("4. Search by Title");
            System.out.println("5. Print All Books");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            try {

                choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {

                    case 1:

                        System.out.print("Enter ID: ");
                        int id = scanner.nextInt();
                        scanner.nextLine();

                        System.out.print("Enter Title: ");
                        String title = scanner.nextLine();

                        System.out.print("Enter Author: ");
                        String author = scanner.nextLine();

                        System.out.print("Enter ISBN: ");
                        String isbn = scanner.nextLine();

                        System.out.print("Enter Number of Pages: ");
                        int pages = scanner.nextInt();
                        scanner.nextLine();

                        inventory.addBook(id, title, author, isbn, pages);
                        break;

                    case 2:

                        System.out.print("Enter Book ID to borrow: ");
                        int borrowId = scanner.nextInt();
                        scanner.nextLine();

                        inventory.borrowBook(borrowId);
                        break;

                    case 3:

                        System.out.print("Enter Book ID to return: ");
                        int returnId = scanner.nextInt();
                        scanner.nextLine();

                        inventory.returnBook(returnId);
                        break;

                    case 4:

                        System.out.print("Enter title or partial title: ");
                        String search = scanner.nextLine();

                        inventory.searchByTitle(search);
                        break;

                    case 5:

                        inventory.printAll();
                        break;

                    case 6:

                        System.out.println("Exiting the program. Goodbye!");
                        break;

                    default:

                        System.out.println("Invalid menu option.");
                }

            } catch (InputMismatchException e) {

                System.out.println("Invalid input. Please enter the correct data type.");
                scanner.nextLine();
            }
        }

        scanner.close();
    }
}