package org.launchcode.java.studios.restaurantmenu;

import java.util.Date;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;


public class MenuItem {

    private String mealName;
    private double price;
    private String description;
    private String category;
    private Date dateAddedToMenu;

    public static void main(String[] args) {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDateTime today = LocalDateTime.now();
        System.out.println(dtf.format(today));



    }

}
