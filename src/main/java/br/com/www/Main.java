package br.com.www;

import br.com.www.interfaces.IOperationDouble;

public class Main {

    public static void main(String[] args) {

        IOperationDouble division = (n1, n2) -> {
            if(n2 == 0) {
                 throw new ArithmeticException("The divisor is 0 (zero).");
            }
            return n1 / n2;
        };

        try {
            System.out.println(division.execute(10, 2));
            System.out.println(division.execute(10, 0));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

    }
}




/*
7 - Crie uma função lambda que recebe dois números e divide o primeiro pelo segundo. A função deve lançar uma exceção
    de tipo ArithmeticException se o divisor for zero.
 */