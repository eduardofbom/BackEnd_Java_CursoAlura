package br.com.www.models;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public record Person(String name, int age, String city) {

    public static void main(String[] args) {
        Gson gson = new Gson();
        Gson gsonGuilder = new GsonBuilder()
                .setLenient()
                .create();

        String jsonPerson1 = """
                {
                "name":"Rodrigo",
                "age":20,
                "city":"Brasília"
                }
                """;
        Person person1 = gson.fromJson(jsonPerson1, Person.class);
        System.out.println(person1);


        String jsonPerson2 = """
                {
                "name":"Rodrigo",
                "city":"Brasília"
                }
                """;
        Person person2 = gson.fromJson(jsonPerson2, Person.class);
        System.out.println(person2);


        String jsonPerson21 = """
                {
                "name":"Rodrigo",
                "age":20
                }
                """;
        Person person21 = gson.fromJson(jsonPerson21, Person.class);
        System.out.println(person21);


        String jsonPerson3 = """
                {
                "name":"Rodrigo",
                "age":20,
                "city":"Brasília",
                "gender":"Male"
                }
                """;
        Person person3 = gson.fromJson(jsonPerson3, Person.class);
        System.out.println(person3);
    }
}








/*
1)  Crie uma classe Pessoa usando o conceito de Record em Java, com atributos como nome, idade e cidade. Em seguida,
    implemente um programa que utiliza a biblioteca Gson para converter um JSON representando uma pessoa em um objeto
    do tipo Pessoa. FEITO!

2)  Modifique o programa do Exercício anterior para permitir a conversão de um JSON mesmo se alguns campos estiverem
    ausentes ou se houver campos adicionais não representados no objeto Pessoa. Consulte a documentação da biblioteca
    Gson para flexibilizar a conversão. EM ANDAMENTO
 */