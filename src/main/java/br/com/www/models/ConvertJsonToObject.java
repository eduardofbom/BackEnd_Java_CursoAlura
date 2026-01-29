package br.com.www.models;

import com.google.gson.Gson;

record Publisher(String name, String city) {}
record Book(String title, String author, Publisher publisher) {}

public class ConvertJsonToObject {
    public static void main(String[] args) {
        Gson gson = new Gson();

        String jsonBook = """
                {
                "title":"Aventuras do Java",
                "author":"Akemi",
                "publisher":{"name":"TechBooks","city":"São Paulo"}
                }
                """;

        Book aventurasDoJava = gson.fromJson(jsonBook, Book.class);
        System.out.println(aventurasDoJava);
    }
}



/*
3)  Crie uma classe Livro que contenha atributos como título, autor e um objeto representando a editora. Em seguida,
    implemente um programa que utiliza a biblioteca Gson para converter um JSON aninhado representando um livro em um
    objeto do tipo Livro.

 */