package models;
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
class Merchandise implements Serializable {
    private String name;
    private int unitCost;
    private int unitPrice;

    public Merchandise(String name, int unitCost, int unitPrice) {
        this.name = name;
        this.unitCost = unitCost;
        this.unitPrice = unitPrice;
    }

    // Getters for name, unitCost, and unitPrice
}