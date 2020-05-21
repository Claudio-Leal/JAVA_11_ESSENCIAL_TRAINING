package com.company.model;

// o nome do CONSTRUCTOR METHOD foi alterado porque o "nome" combina com...
// o nome da própria classe. É sempre assim,...já registrei isso antes.

public class Hat extends ClothingItem {
    public Hat(ClothingSize size, int quantity, Double price) {
        super(ClothingItem.HAT, size, quantity, price);
    }
}
