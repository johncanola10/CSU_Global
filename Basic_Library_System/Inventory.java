import java.util.ArrayList;

public class Inventory {

    private ArrayList<Book> mainInventory;
    
    private  ArrayList<Book> borrowedInventory;

    public Inventory() {

        mainInventory = new ArrayList<>();

        borrowedInventory = new ArrayList<>();
    }
}