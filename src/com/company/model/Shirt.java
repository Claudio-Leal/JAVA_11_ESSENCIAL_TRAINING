package com.company.model;


public class Shirt extends ClothingItem {
    public Shirt(ClothingSize size, int quantity, Double price) {
        super(ClothingItem.SHIRT, size, quantity, price);
    }
}
