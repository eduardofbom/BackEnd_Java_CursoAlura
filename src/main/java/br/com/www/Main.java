package br.com.www;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        System.out.println(getFirstAndLastName("  João Carlos Silva   ")); // Saída: "João Silva"
        System.out.println(getFirstAndLastName("Maria   ")); // Saída: "Maria"

    }

    private static String getFirstAndLastName(String completeName) {
        List<String> nameInList = List.of(completeName.trim().split(" "));

        if(nameInList.size() > 1) {
            return nameInList.getFirst() + " " + nameInList.getLast();
        } else {
            return nameInList.getFirst();
        }
    }

}




/*
3 - Implemente um método que recebe uma String representando um nome completo separado por espaços. O método deve
    retornar o primeiro e o último nome após remover os espaços desnecessários.


public class Main {

    public static void main(String[] args) {
           System.out.println(obterPrimeiroEUltimoNome("  João Carlos Silva   ")); // Saída: "João Silva"
System.out.println(obterPrimeiroEUltimoNome("Maria   ")); // Saída: "Maria"


    }

public static String obterPrimeiroEUltimoNome(String nomeCompleto) {
    // Implementar aqui
}

}
 */