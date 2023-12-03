package models;
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
class BusinessOwner extends User implements Serializable {

    public BusinessOwner(String name, String staffCode) {
        super(name, staffCode);
    }

    public void addNewInventory(String name, int unitCost, int unitPrice) {
    }

    public void setDiscount(String name, double discountRate) {
    }
}