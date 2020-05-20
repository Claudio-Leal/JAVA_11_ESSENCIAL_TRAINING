package com.company.utilities;

// Aqui serão declarados 4 métodos, todos marcados como ESTÁTICOS, para que possam ser chamados da própria...
// própria classe, e não de uma instância da classe.

// Serão iniciados com modificador de acesso público, o que significa que poderão ser chamados...
// de qualquer local da aplicação.

public class CalcHelper {
    // Declaração do método:
    // public: poderá ser chamado de qualquer local.
    // static: serão chamados da própria classe, e não de uma instância de classe.
    // double: tipo de dado para o retorno.
    // addValues: nome do método.
    // (parâmetros d1 e d2 que serão passados no argumento).
    public static double adittion (double d1, double d2) {
        // abaixo, os retornos deste método para adição:
        return d1 + d2;
    }

    public static double subtraction (double d1, double d2) {
        // abaixo, os retornos deste método para subtração:
        return d1 - d2;
    }

    public static double multiplication (double d1, double d2) {
        // abaixo, os retornos deste método para multiplicação:
        return d1 * d2;
    }

    public static double division (double d1, double d2) {
        // abaixo, os retornos deste método para multiplicação:
        return d1 / d2;
    }
}
