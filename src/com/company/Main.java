package com.company;

// Todas as classes que estão sendo utilizadas aqui, inclusive a última: Shirt.
// Através da função CODE > OPTIMAZE IMPORTS, a importação da classe ClothingItem será excluída..
// deste código, pois ela não está sendo utilizada no momento.
// o que ocorre agora é a chamada da classe Shirt,...SUBCLASSE da SUPERCLASSE ClothingItem.
// E esta (Shirt) referencia (ClothingItem).
// Avaliando o código, vemos que realmente o método ClothingItem foi excluído,...agora estamos...
// chamando apenas Shirt,...então não é mais necessário importar ClothingItem.

import com.company.model.ClothingSize;
import com.company.model.Shirt;

import java.text.NumberFormat;

public class Main {
    public static void main (String [] args) {


        // Criação de uma instância da classe Shirt,...
        // em que os valores das variáveis size, quantity e price estão sendo passados.
        // passando apenas valores para três parâmetros, pois "type" foi excluído dos argumentos...
        // do CONSTRUCTOR METHOD Shirt.

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
