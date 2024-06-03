package com.example;

// Starter code for Bike class
public class Bike {
    // Attributes
    private String brand;
    private String model;
    private int year;
    private String color;
    private double price;

    // Add a constructor here
    // public Bike(String brand, String model, int year, String color, double price) { ... }

    // Add getter and setter methods here
    // public String getBrand() { ... }
    // public void setBrand(String brand) { ... }
    // public String getModel() { ... }
    // public void setModel(String model) { ... }
    // public int getYear() { ... }
    // public void setYear(int year) { ... }
    // public String getColor() { ... }
    // public void setColor(String color) { ... }
    // public double getPrice() { ... }
    // public void setPrice(double price) { ... }

    public Bike(String brand, String model, int year, String color, double price) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    
    

    // Method to display bike details
    public void displayBikeDetails() {
        // TODO: Implement this method
        System.out.println("brand"+brand);
        System.out.println("model"+model);
        System.out.println("year"+year);
        System.out.println("color"+color);
        System.out.println("price"+price);
    }

    // Method to update price
    public void updatePrice(double newPrice) {
        // TODO: Implement this method
    }
}
