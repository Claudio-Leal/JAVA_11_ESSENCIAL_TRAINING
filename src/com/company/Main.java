package com.company;

import com.company.model.ClothingItem;

import java.text.NumberFormat;

public class Main {
    public static void main (String [] args) {
        // Aqui estou instanciando a classe ClothingItem, com a declaração...
        // da variável item.
        // Observe que chamando os métodos sets.
       // Aqui, um exemplo de constante "tipo", sendo chamada através dos parâmetros.
        var item = new ClothingItem(ClothingItem.SHIRT,"M",3,19.45);

        // Bloco abaixo pode ser comentado, pois agora os valores estão....
        // sendo passados pelos parâmetros do método ClothingItem.
//        item.setType("Shirt");
//        item.setSize("M");
//        item.setQuantity(3);
//        item.setPrice(19.45);

        // totalizando:
        // Aqui, já estou chamando os métodos gets.
        // Formatando os valores, utilizando o método adequado para a aplicação da...
        // moeda corrente.
        // variável output ficará responsável pela impressão na tela, com os valores...
        // devidamente formatados.
        // Ao final, impressão da mensagem formatada.
        var total = item.getPrice() * item.getQuantity();
        var formatNumber = NumberFormat.getCurrencyInstance();
        var output = String.format("Your %s order will cust %s",
                item.getType(),
                formatNumber.format(total));
        System.out.println(output);
    }
}
