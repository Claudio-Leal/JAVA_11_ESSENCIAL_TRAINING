package com.company;

import com.company.model.ClothingItem;
import com.company.model.ClothingSize;

import java.text.NumberFormat;

public class Main {
    public static void main (String [] args) {
        // Aqui estou instanciando a classe ClothingItem, com a declaração...
        // da variável item.
        // Observe que chamando os métodos sets.
       // Aqui, um exemplo de constante "tipo", sendo chamada através dos parâmetros.
        var item = new ClothingItem(
                ClothingItem.SHIRT,
                ClothingSize.G,
                3,
                19.45);

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
        var output = String.format("Your %s size %s order will cust %s",
                item.getType(),
                // Incluí getSize nesta versão.
                // Fluxo da informação:
                // 1 - Classe ClothingSize
                // 2 - Classe Main, com a passagem de ClothingSize.G nos parâmetros do CONSTRUCTOR METHOD
                // ClothingItem.
                // 3 - Variável Size, declarada com o novo tipo ClothingSize, recebe o valor G.
                item.getSize(),
                formatNumber.format(total));
        System.out.println(output);
    }
}
