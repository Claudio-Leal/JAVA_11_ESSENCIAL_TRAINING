/*
Manage key-values pairs with maps
Gerenciar pares de valores-chave com o Maps
Para criar uma lista desordenada.
Cada item da lista, possui um valor chave como par.

Tivemos anteriormente:
Array
Lists
e agora: Maps
Todos são estruturas de dados.
Maps também é uma interface,...

*/


package com.company;

import com.company.model.ClothingItem;
import com.company.model.ClothingSize;
import com.company.model.Hat;
import com.company.model.Shirt;

import java.text.NumberFormat;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main (String [] args) {

        // Abaixo, bloco com os Maps.
        // A declaração é parecida com Lists, usando <>.
        // Dentro dos <>, entrarão o par de valor chave + item.
        // Esquerda: tipo de dado.
        // Chave: String.
        // Tipo de item: ClothingItem.
        // objetos: nome do Map.
        // new HashMap: criação de uma instância da classe HashMap. Definição no github (pullrequest).
        // não é necessário passar os parâmetros dentro dos <> do HashMap, pois isso já foi feito...
        // no Map.

        Map<String , ClothingItem> objetos = new HashMap<>();

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
