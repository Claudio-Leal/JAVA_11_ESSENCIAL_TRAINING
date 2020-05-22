/*
Esta versão de código mostra duas formas de declarar arrays.
Nas duas formas, os valores (e a quantidade de posições), são estáticos e imutáveis.
Esta é uma característica de arrays simples.
Se precisarmos de algo mais flexível, será necessário criar arrays com classes (próximo tópico).
*/



package com.company;


import com.company.model.ClothingItem;
import com.company.model.ClothingSize;
import com.company.model.Hat;
import com.company.model.Shirt;

import java.text.NumberFormat;

public class Main {
    public static void main (String [] args) {

        // Store values in simple arrays
        // Armazenando valores em um simples array
        // String: tipo de dado.
        // []: sintaxe que identifica a criação de um array.
        // colors: nome da variável, ou seja, do array.
        // new String: Iniciação de uma instância da classe String, com array de 3 posições.

        //        Strings in Java
        //        Strings in Java are Objects that are backed internally by a char array.
        //        Since arrays are immutable(cannot grow), Strings are immutable as well.
        //        Whenever a change to a String is made, an entirely new String is created.
        //
        //        Below is the basic syntax for declaring a string in Java programming language.        //

        //        Strings em Java
        //        Strings em Java são objetos que são apoiados internamente por uma matriz de caracteres.
        //        Como matrizes são imutáveis ​​(não podem crescer), as seqüências de caracteres também são imutáveis.
        //        Sempre que uma alteração em uma String é feita, uma String totalmente nova é criada.        //
        //        Abaixo está a sintaxe básica para declarar uma string na linguagem de programação Java.

        //        String: String is a sequence of characters. In java, objects of String are immutable which means a constant and cannot be changed once created.
        //        Creating a String
        //        There are two ways to create string in Java:
        //        String literal
        //        String s = “GeeksforGeeks”;
        //        Using new keyword
        //        String s = new String (“GeeksforGeeks”);

        String [] colors = new String[3];
        colors [0] = "Blue";
        colors [1] = "Green";
        colors [2] = "Red";

        for (int i = 0; i < colors.length; i++) {
            System.out.println("The color is: "+ colors[i]);
        }


                // Aqui também é possível criar um array com dois itens, e com todo o conteúdo..
                // de cada item.
                // O array itens possui dois itens:
                //[0] = Shirt.
                //[1] = Hat.
                // Trata-se de um array imutável,...ou seja, não pode ser modificado.
                // para acessá-lo, usaremos foreach.

                ClothingItem [] produtos = {
                        new Shirt (
                                ClothingSize.G,
                                3,
                                19.45),

                        new Hat(
                                ClothingSize.M,
                                2,
                                21.60)
                };

                // O acesso ao array itens será feito pelo foreach abaixo.
                // "Tipo de dado" ClothingItem (instância de ClothingItem), criando...
                // a variável "tipos". Ela receberá o conteúdo de todas as posições do array produtos.
                // ou seja, antes dos ":", inserimos a variável que receberá os valores do array.
                // após os ":", inserimos a variável que será varrida.
                // dentro do bloco {}: inserimos os comandos.
                // com foreach, não precisamos nos preocupar com a sintaxe de incremento,...etc.
                // por si só, o foreach já faz isso.
                // displayItemDetails está chamando o método que vem mais abaixo e passando para ele...
                // os valores do array (valores de Shirt e Hat).
                // Desta forma, as outras classes serão chamadas apenas naquilo que lhes compete,...
                // como no caso de new Shirt, new Hat,..etc.

                for (ClothingItem tipos : produtos) {
                    displayItemDetails (tipos);
                }
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
