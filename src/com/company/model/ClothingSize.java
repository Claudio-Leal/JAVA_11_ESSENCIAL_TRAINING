package com.company.model;

public enum ClothingSize {
    P("Pequeno"), M ("Médio"), G ("Grande");

    private String description;

    ClothingSize(String description) {
        this.description = description;
    }
    @Override
    public String toString() {
        return description;
    }
}



