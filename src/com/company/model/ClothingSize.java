// Classe criada para criar um ENUM para a variável size (para o tamanho da roupa).
// Precisei mexer na variável size, da classe ClothingItem.
// ; só não é obrigatório, no fim das declarações, quando estivermos trabalhando apenas com uma linha.
// Abaixo, a criação de um CONSTRUCTOR METHOD que permitirá a utilização de uma descrição.
// Esta descrição será impressa,...e não o ENUM.
// Será uma "tradução" para uma simples string.
package com.company.model;

public enum ClothingSize {
    // Ao criar o CONSTRUCTOR METHOD dentro do ENUM ClothingSize, cada enum declarado,...
    // permite a inclusão uma string que é atribuída à description.
    // Cada enum pode chamar o CONSTRUCTOR METHOD, passando valores para os parâmetros...
    // inseridos nos argumentos do CONSTRUCTOR METHOD.
    P("Pequeno"), M ("Médio"), G ("Grande");

    // Para criar a "tradução", iniciei com a declaração desta variável.
    // É com base nela que o CONSTRUCTOR METHOD será criado.
    private String description;

    // Note que permaneço dentro do bloco do enum.
    // A utilização dos facilitadores para criação de CONSTRUCTOR METHOD, por exemplo,...
    // exige que as variáveis base estejam devidamente declaradas. Somente assim é que...
    // são inseridas "prontas" e somente assim é que farão ganharmos tempo.
    ClothingSize(String description) {
        this.description = description;
    }

    // Toda classe possui um uma chamada para o método toString.
    // É o início do conceito de super classe.
    // Observe que aqui tem um "@override". É ele o responsável por fazer a substituição.

    // originalmente, a classe foi inserida assim:
//    @Override
//    public String toString() {
//        return "ClothingSize{" +
//                "description='" + description + '\'' +
//                '}';


    // mas só precisamos do retorno description, ela foi devidamente alterada.
    // Definições abaixo sobre o método toString():
//    toString
//    public String toString()
//    This object (which is already a string!) is itself returned.
//    Specified by:
//    toString in interface CharSequence
//    Overrides:
//    toString in class Object
//    Returns:
//    the string itself.


    // Resumindo, temos:
    // @Overrride: responsável pela sobreposição.
    // public: utilizável em qualquer parte da aplicação.
    // String: tipo de retorno na chamada do método.
    // toString: o próprio método, mas sem parâmetros nos argumentos.
    // o método recebe como retorno o valor de description, declarado anteriormente.
    @Override
    public String toString() {
        return description;
    }
}



