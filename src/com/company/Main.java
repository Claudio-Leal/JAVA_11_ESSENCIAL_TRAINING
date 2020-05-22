/* Manage key-values pairs with maps
Gerenciar pares de valores-chave com o Maps
*/


package com.company;

import com.company.model.ClothingItem;
import com.company.model.ClothingSize;
import com.company.model.Hat;
import com.company.model.Shirt;

import java.text.NumberFormat;

public class Main {
    public static void main (String [] args) {


        var shirt = new Shirt (
                                ClothingSize.G,
                                3,
                                19.45);
        displayItemDetails(shirt);
            var hat = new Hat(
                                ClothingSize.M,
                                2,
                                21.60);
        displayItemDetails(hat);

    }
    private static void displayItemDetails(ClothingItem item) {
        var total = item.getPrice() * item.getQuantity();
        var formatNumber = NumberFormat.getCurrencyInstance();
        var output = String.format("Your %s size %s order will cust %s",
                item.getType(),
                item.getSize(),
                formatNumber.format(total));
        System.out.println(output);
    }
}
