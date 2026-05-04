package br.com.www;

import br.com.www.models.Product;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Product> products = Arrays.asList(
                new Product("Smartphone", 800.0, "Electronics"),
                new Product("Notebook", 1500.0, "Electronics"),
                new Product("Keyboard", 200.0, "Electronics"),
                new Product("Chair", 300.0, "Furniture"),
                new Product("Monitor", 900.0, "Electronics"),
                new Product("Table", 700.0, "Furniture")
        );

        String category = "Electronics";
        products.stream()
                .filter(p -> (p.getCategory().equals(category)   && p.getPrice() < 1000))
                .sorted(
                        (p1,p2) -> Double.compare(p1.getPrice(), p2.getPrice())
                )
                .forEach(System.out::println);

    }
}




/*
7 - Você tem uma lista de objetos do tipo Produto, onde cada produto possui os atributos nome (String), preco (double)
    e categoria (String). Filtre todos os produtos da categoria "Eletrônicos" com preço menor que R$ 1000, ordene-os
    pelo preço em ordem crescente e colete o resultado em uma nova lista.

Produto.java

public class Produto {
    private String nome;
    private double preco;
    private String categoria;

    public Produto(String nome, double preco, String categoria) {
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public String getCategoria() {
        return categoria;
    }

    @Override
    public String toString() {
        return "Produto{" +
               "nome='" + nome + '\'' +
               ", preco=" + preco +
               ", categoria='" + categoria + '\'' +
               '}';
    }
}
Main.java

public class Main {
    public static void main(String[] args) {
        List<Produto> produtos = Arrays.asList(
            new Produto("Smartphone", 800.0, "Eletrônicos"),
            new Produto("Notebook", 1500.0, "Eletrônicos"),
            new Produto("Teclado", 200.0, "Eletrônicos"),
            new Produto("Cadeira", 300.0, "Móveis"),
            new Produto("Monitor", 900.0, "Eletrônicos"),
            new Produto("Mesa", 700.0, "Móveis")
        );

        // código para filtrar os produtos
    }
}
 */