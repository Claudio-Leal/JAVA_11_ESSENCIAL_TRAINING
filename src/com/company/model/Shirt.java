package com.company.model;

// Utiliza-se a palavra chave extends para "relacionar" a classe com outra classe.
// Neste caso, estamos extendendo a classe Shirt.java à classe ClothingItem.
// Agora, esta classe está herdando todas as funcionalidades da classe ClothingItem.
// Com isso, posso acessar todos os CONSTRUCTOR METHODS da classe ClothingItem.
// Com isso, posso acessar todos os METHODS da classe ClothingItem.
// Mas o que está marcado como privado, permanece privado.
// Serão os os métodos gets e o constructor ClothingItem que fará acesso aos objetos privados (variáveis...
// que identificam o ITEM ROUPA.
// Lembrnado que esta classe (Shirt.java) é uma subclasse da classe ClothingItem,...e isso ocorreu...
// quando utilizei o extends.
// Ao incluir o "extends", não houve nenhuma marcação especial em ClothingItem,...mas concluo...
// que ela é a SUPERCLASSE desta SUBCLASSE.

public class Shirt extends ClothingItem {

    // Com a utilização de CODE > GENERATE > CONSTRUCTOR, inseri este CONSTRUCTOR METHOD.
    // Note que:
    // public: poderá ser acessada a partir de qualquer parte da aplicação.
    // Shirt: nome do CONSTRUCTOR METHOD.
    // parâmetros: as quatro variáveis declaradas na super classe.
    // não tem retorno, pois se trata de um CONSTRUCTOR METHOD.
    // super: é uma palavra chave, na verdade, uma variável. Definições abaixo...
    // no caso, ela está referenciando as quatro variáveis (os quatro objetos) declaradas em ClothingItem.
    // Mais uma vez, digo que estes quatro objetos (estas quatro variáveis), são privadas em ClothingItem.
    // super, pelo que entendi, possui a função de dizer: sim,...estes são objetos existentes,..declarados,...
    // na superclasse. Por isso, os referencia,...recebendo os valores dos mesmos pelos parâmetros.

    // super: The super keyword in java is a reference variable that is used to refer parent class...
    // objects.  The keyword “super” came into the picture with the concept of Inheritance.
    //    A super palavra-chave em java é uma variável de referência usada para referenciar objetos...
    //    de classe pai. A palavra-chave “super” entrou em cena com o conceito de herança.
    //    É usado principalmente nos seguintes contextos:
    //            1. Uso de super com variáveis: este cenário ocorre quando uma classe derivada e...
    //            uma classe base têm os mesmos membros de dados.
    //            Nesse caso, há uma possibilidade de ambiguidade para a JVM.


    public Shirt(String type, ClothingSize size, int quantity, Double price) {
        super(type, size, quantity, price);
    }
}
