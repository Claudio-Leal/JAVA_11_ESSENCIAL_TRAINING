/*
LISTAS!!
Gerenciar matrizes redimensionáveis ​​com listas!!
Trecho retirado da classe ArrayList.java.
É a parte que descreve como a relação entre classes e interfaces será estabelecida.
A letra E é um parâmetro utilizado para isso.

public class ArrayList<E> extends AbstractList<E>
        implements List<E>, RandomAccess, Cloneable, java.io.Serializable

Vamos utilizar o parâmetro E na Lista.
the letter "e" means  any sort of types.
A letra "E" significa qualquer tipo de dado porá ser usado.

Utilizando listas, é possível inserir quantos registros eu quiser,...ordenando-os ou reordenando-os.
Aqui, vimos o básico de listas. É importante ver a documentação sobre a Interface List, e especialmente
as classes LinkedList e Vector.

*/

package com.company;

import com.company.model.ClothingItem;
import com.company.model.ClothingSize;
import com.company.model.Hat;
import com.company.model.Shirt;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main (String [] args) {
                // A declaração da lista será feita aqui.
                // A sintaxe é simples:
                // List: interface que cria a lista.
                // <>: dentro, o tipo de dado a ser utilizado na lista. No caso, uma String.
                // colors: nome da lista.
                // new ArrayList: criação de uma instância da classe ArrayList.
                // na criação da instância, não há necessidade de indicar o tipo de dado que será,..
                // armazenado, pois isso já foi feito na declaração da lista colors.
                List<String> colors = new ArrayList<>();
                // Agora, a criação da lista, usando o nome da lista.add:
                // Note que ao contrário do array, posso inserir na lista quantos itens eu quiser.
                colors.add("Red");
                colors.add("Green");
                colors.add("Blue");
                colors.add("Yellow");

                // Para acessar a lista, vou utilizar o for, mas não com LENGHT, mas sim, com SIZE.
                // Listas possuem SIZE, e não LENGHT.
                for (int i = 0; i < colors.size() ; i++) {
                    // e para acessar a lista, utilizar get:
                    System.out.println(colors.get(i));
                }

                // Agora, criando uma lista com o tipo de dado ClothingItem.
                // E fazendo o acesso desta lista através de foreach.
                List<ClothingItem> produtos = new ArrayList<>();
                produtos.add(new Shirt (
                        ClothingSize.G,
                        3,
                        19.45));

                produtos.add(new Hat(
                        ClothingSize.M,
                        2,
                        21.60));

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
