// Esta classe é SUPERCLASSE da classe Shirt.java.

package com.company.model;

public class ClothingItem {


    private String type;
    private ClothingSize Size;
    private int quantity;
    private Double price;

    public static final String SHIRT = "Shirt";
    public static final String PANTS = "Pants";
    public static final String SHOES = "Shoes";


    public ClothingItem(String type, ClothingSize size, int quantity, Double price) {
        this.type = type;
        this.Size = size;
        this.quantity = quantity;
        this.price = price;
    }
    public String getType() {
        return type;
    }
    public ClothingSize getSize() {
        return Size;
    }
    public int getQuantity() {
        return quantity;
    }
    public Double getPrice() {
        return price;
    }
}

