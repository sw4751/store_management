package models;
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
class Store implements Serializable {
    private List<User> users;
    private List<Transaction> transactions;
    private List<Merchandise> merchandiseList;

    public Store() {
        this.users = new ArrayList<>();
        this.transactions = new ArrayList<>();
        this.merchandiseList = new ArrayList<>();
    }

    public void addUser(User user) {
    }

    public void updateTransactions(Transaction transaction) {
    }

    public void updateInventory() {
    }
}