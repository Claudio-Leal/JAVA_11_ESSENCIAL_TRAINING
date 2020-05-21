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
    private ClothingSize Size;
    private int quantity;
    private Double price;

    // Bloco abaixo, declaração de constantes. Neste exemplo,...
    // faremos isso porque seria difícil identificar um erro nos "valores"...
    // passados através de parâmetros,..que identificam o tipo, tamanho, etc.
    // Segundo o curso, se declararmos como constantes, a identificação de eventuais...
    // problemas será facilitada.
    // São três novas variáveis declardas,...com letras maiúsculas, pois são CONSTANTES.
    // E note que são três strings "tipos de roupas" diferentes declarados.
    // A ideia aqui é pegar estas constantes e utilizar na classe main,...
    // estes valores aparecerão como constantes,...de forma que podemos chamá-los,..
    // como se fossem classes, métodos, etc.
    public static final String SHIRT = "Shirt";
    public static final String PANTS = "Pants";
    public static final String SHOES = "Shoes";


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
    public ClothingItem(String type, ClothingSize size, int quantity, Double price) {
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

    public ClothingSize getSize() {
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

/*
O que ocorre neste novo formato:
1 - O método clothingItem é instanciado na classe Main.
2 - Através dos parâmetros, os valores dos parâmetros do método ClothingItem são transferidos,
ou seja, passados para o método, na classe ClothingItem. Durante o debug, vi que a execução é
remetida para esta classe.
3 - Dentro da classe ClothingItem, cada variável recebe os valores que foram passados,...
com o uso da palavra chave this.
4 - Concluída esta etapa, a execução volta para a classe main, e inicia a execução a partir da linha...
28, de maneira que os métodos gets são chamados.
5 - Cada método get possui o retornos,...e estes retornos são justamente os valores armazenados...
anteriormente pelo método ClothingItem.
6 - Conforme os gets vão sendo chamados, a execução a partir da linha 28 vai sendo construída,...
com idas e vindas,...pois todos os gets são chamados para concluir o input final.
 */

