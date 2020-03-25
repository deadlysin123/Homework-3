package com.cis3368.Homework3.Main.Models;
import javax.persistence.*;


@Entity
@Table (name ="inventory")

public class Sport {

    @Id
    @Column(name = "Description")
    private String description;
    @Column(name = "Price")
    private String price;
    @Column(name = "Color")
    private String color;

    //default
    public Sport(){}


    // passing values into the book object: description, price and color
    public Sport(String description, String price, String color){
        this.description = description;
        this.price = price;
        this.color = color;
    }

    //getter and setter
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
