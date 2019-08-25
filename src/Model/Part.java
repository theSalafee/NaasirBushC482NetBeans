/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author naasirbush
 */
public class Part {
    
    
    // Private members
    private int id;
    private double price;
    private int stock;
    private int min;
    private int max;
    private String name;

    // Class Constructor
    public Part(int id, double price, int stock, int min, int max, String name) {
        this.id = id;
        this.price = price;
        this.stock = stock;
        this.min = min;
        this.max = max;
        this.name = name;
    }

    // Getters & Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setPrice(int max) {
        this.max = max;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }
    
}
