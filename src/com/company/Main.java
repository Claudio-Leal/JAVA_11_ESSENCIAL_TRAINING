package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

// Desafio da calculadora "super complexa", que impede que o usuário...
// entre com valores diferente dos esperados (exemplos, textos).
public class Main {

    public static void main(String[] args) {
	    // variável sc recebendo a criação da instância da classe newScanner.
        // lembrando que a biblioteca é importada automaticamente no início do código.
        var sc = new Scanner(System.in);

        // variáveis d1 e d2,...responsáveis pela entrada do usuário.
        double d1, d2;
        // try-catch aplicado abaixo. É ele que fará o teste sobre os valores...
        // inseridogs pelo usuário.
        // lembrando que é o método nextDouble é o responsável por impedir...
        // a entrada de valores diferentes de double.
        try {
            System.out.println("Valor 1:");
            d1 = sc.nextDouble();
            sc.nextLine();

            System.out.println("Valor 2:");
            d2 = sc.nextDouble();
            sc.nextLine();
        } catch (InputMismatchException e) {
            System.out.println("Formato inválido");
            // lembrando que este return é apenas para que returne "null ou zero",...
            // para o método. O código será abortado nesta fase.
            return;
        }
        // Solicitação para que o usuário digite a operação:
        System.out.println("Operação: (+ - / *): ");
        var operacao = sc.nextLine();
        double result;

        switch (operacao){
            case "+":
                result = CalcHelper.adittion(d1,d2);
                break;

            case "-":
                result = CalcHelper.subtraction(d1,d2);
                break;

            case "*":
                result = CalcHelper.multiplication(d1,d2);
                break;

            case "/":
                result = CalcHelper.division(d1,d2);
                break;

            default:
                System.out.println("Operador inválido!");
                return;
        }
        System.out.println(result);
    }
}


