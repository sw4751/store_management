package models;
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

package com.example.myproject.model;
import javax.persistence.Entity;
import java.util.Iterator;

@Entity
public class BusinessOwner extends User implements Serializable {

    public BusinessOwner(Long id, String name, String staffCode) {
        super(id, "businessOwner", name, staffCode); // Automatically sets the type to "businessOwner"
    }
    public void add_new_Merchandise(String name, int unit_cost, int unit_price) {
        boolean exists = false;

        // Check if an item with the same name already exists
        for (Merchandise item : inventory) {
            if (item.getName().equalsIgnoreCase(name)) {
                exists = true;
                break;
            }
        }

        // Add the new item if it doesn't exist
        if (!exists) {
            Merchandise newMerchandise = new Merchandise(name, unit_cost, unit_price);
            inventory.add(newMerchandise);
        } else {
            System.out.println("Item with the name " + name + " already exists.");
        }
    }


    public void add_new_SalesStaff(Long id, String name, String staffCode)
    {
        boolean exists = false;

        // Check if a SalesStaff with the same staffCode already exists
        for (User user : users) {
            if (user instanceof SalesStaff && ((SalesStaff) user).getStaffCode().equalsIgnoreCase(staffCode)) {
                exists = true;
                break;
            }
        }

        // Add the new SalesStaff if it doesn't exist
        if (!exists) {
            SalesStaff newSalesStaff = new SalesStaff(id, name, staffCode);
            users.add(newSalesStaff);
        } else {
            // Handle the case where a SalesStaff with the same staffCode already exists
            // For example, you might want to print a message or throw an exception
            System.out.println("A SalesStaff with staffCode " + staffCode + " already exists.");
        }
    }

    public void delete_staff(String StaffCode)
    {
        Iterator<User> iterator = users.iterator();

        while (iterator.hasNext()) {
            User user = iterator.next();

            // Check if the user is a staff member with the given staffCode
            if (user instanceof SalesStaff && user.getStaffCode().equalsIgnoreCase(staffCode)) {
                iterator.remove();
                System.out.println("Staff with staffCode " + staffCode + " has been removed.");
                return;
            }
        }

        // Optional: Handle the case where no staff with the given staffCode was found
        System.out.println("No staff found with staffCode " + staffCode + ".");
    }

    public void set_discount(String name, double discount_rate) {
        for (Merchandise item : inventory) {
            if (item.getName().equals(name)) {
                double originalPrice = item.getUnitPrice();
                double discountedPrice = originalPrice * (1 - discount_rate);
                item.setUnitPrice(discountedPrice);
                break; // Exit the loop once the item is found and updated
            }
        }

    }
}

