package com.company;


import com.company.model.ClothingSize;
import com.company.model.Shirt;

import java.text.NumberFormat;

public class Main {
    public static void main (String [] args) {

        var item = new Shirt (
                ClothingSize.G,
                3,
                19.45);

        var total = item.getPrice() * item.getQuantity();
        var formatNumber = NumberFormat.getCurrencyInstance();
        var output = String.format("Your %s size %s order will cust %s",
                item.getType(),
                item.getSize(),
                formatNumber.format(total));
        System.out.println(output);
    }
}
