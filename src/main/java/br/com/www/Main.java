package br.com.www;

import br.com.www.models.Product;

import java.util.*;
import java.util.stream.Collectors;

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

        Map<String, Double> totalPriceByCategory = products.stream()
                .collect(Collectors.groupingBy(Product::getCategory,
                        Collectors.summingDouble(Product::getPrice)));
        System.out.println(totalPriceByCategory);

    }
}




/*

 */