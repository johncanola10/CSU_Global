import java.util.ArrayList;

public class Inventory {

    private ArrayList<Book> mainInventory;
    
    private  ArrayList<Book> borrowedInventory;

    public Inventory() {

        mainInventory = new ArrayList<>();

        borrowedInventory = new ArrayList<>();
    }

    public void addBook(int id, String title, String author, String isbn, int numberOfPages) {

        Book newBook = new Book(id, title, author, isbn, numberOfPages);
        mainInventory.add(newBook);
    }

    public void borrowBook(int id) {
        Book foundBook = null;
        for (Book book : mainInventory) {
            if (book.getId() == id) {
                foundBook = book;
                break;
            }
        }

        if (foundBook != null ) {
                mainInventory.remove(foundBook);
                borrowedInventory.add(foundBook);
                System.out.println("Book successfully borrowed!");
        } else {
            System.out.println("Book not found!");
        }
        
    }

    public void returnBook(int id) {
        Book foundBook = null;
        for (Book book : borrowedInventory) {
            if (book.getId() == id) {
                foundBook = book;
                break;
            }
        }

        if (foundBook != null) {
            borrowedInventory.remove(foundBook);
            mainInventory.add(foundBook);
            System.out.println("Book successfully returned.");
        } else {
            System.out.println("This book was not borrowed.");
        }
    
    }

     // Print all available books
    public void printAll() {

        if (mainInventory.isEmpty()) {
            System.out.println("No books available.");
            return;
        }

        for (Book book : mainInventory) {
            book.printBookInfo();
            System.out.println();
        }
    }

    // Search by title (partial and case-insensitive)
    public void searchByTitle(String title) {

        boolean found = false;

        for (Book book : mainInventory) {

            if (book.getTitle().toLowerCase().contains(title.toLowerCase())) {
                book.printBookInfo();
                System.out.println();
                found = true;
            }
        }

        if (!found) {
            System.out.println("No matching book found.");
        }
    }

    // Helper method
    public int getMainInventoryCount() {
        return mainInventory.size();
    }
    
}