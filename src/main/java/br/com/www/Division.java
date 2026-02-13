package br.com.www;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("First number: ");
        Integer number1 = scanner.nextInt();
        System.out.println("Second number: ");
        Integer number2 = scanner.nextInt();

        try {
            Integer result = number1 / number2;
            System.out.printf("%nRESULT:%n%d / %d = %d%n", number1, number2, result);
        } catch (ArithmeticException e) {
            System.out.println("EXCEPTION: Division by zero(0) isn't allowed.");
        }

        scanner.close();
    }
}


/*
Crie um programa simples que solicita dois números ao usuário e realiza a divisão do primeiro pelo segundo. Utilize o
bloco try/catch para tratar a exceção que pode ocorrer caso o usuário informe 0 como divisor.
 */