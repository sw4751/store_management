package models;
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class User implements Serializable {
    private String name;
    private String staffCode;

    public User(String name, String staffCode) {
        this.name = name;
        this.staffCode = staffCode;
    }

}