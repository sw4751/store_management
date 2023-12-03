package models;
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class InventoryManager extends User implements Serializable{
    public InventoryManager(String name, String staffCode) {
        super(name, staffCode);
    }

    public void buyProducts(String name, int unitCost, int quantity) {
    }

    public void viewAll() {
    }
}
