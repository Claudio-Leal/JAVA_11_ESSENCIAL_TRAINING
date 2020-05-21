// Observe aqui a referência ao local onde o pacote se encontra.
// Relembrando,..quando esta referência existe, a classe não é a default.
// Neste classe, vamos ter 4 métodos que farão referência ao tipo, tamanho, preço e quantidade.
package com.company.model;

// public: poderá ser chamada de qualquer local da aplicação.
// class: representa a declaração de uma classe, ou seja, isto é uma classe.
// ClothingItem: nome da classe.
public class ClothingItem {
    // todas estas variáveis (que serão os campos) só poderão ser chamadas...
    // a partir desta classe, pois estão declaradas como "private".
    // Generate > Getter And Setter > Selecionar tudo.
    // Com isso, métodos GETs e SETs foram criados com base nas variáveis declaradas.
    // que permaneceram no código.

    private String type;
    private String Size;
    private int quantity;
    private Double price;

    // repare que os métodos foram declarados como públicos, o que permitirá que...
    // sejam chamados de qualquer parte da aplicação.
    // public: poderá ser chamado de qualquer ponto da aplicação.
    // String ou void: tipo de retorno esperado pelo método.
    // no caso dos métodos sets: argumento do método que passa como parâmetro, o valor...
    // da variável type.

    // Trata-se de um método:
    // public: pode ser chamado de qualquer ponto da aplicação.
    // ClothingItem: nome do método.
    // (): argumentos que passam como parâmetro, os valores das variáveis...
    // através da palavra chave this.
    // Com isso, os "sets" feitos mais abaixo, se tornam inúteis, por isso...
    // foram comentados.
    public ClothingItem(String type, String size, int quantity, Double price) {
        this.type = type;
        this.Size = size;
        this.quantity = quantity;
        this.price = price;
    }

    public String getType() {
        return type;
    }

//    public void setType(String type) {
//        this.type = type;
//    }

    public String getSize() {
        return Size;
    }

//    public void setSize(String size) {
//        Size = size;
//    }

    public int getQuantity() {
        return quantity;
    }

//    public void setQuantity(int quantity) {
//        this.quantity = quantity;
//    }

    public Double getPrice() {
        return price;
    }

//    public void setPrice(Double price) {
//        this.price = price;
//    }
}
