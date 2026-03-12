package br.com.www.models;

public class Product {
    private String name;
    private double price;
    private Integer quantity;

    public Product(String name, double price, Integer quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public Integer getQuantity() {
        return quantity;
    }

    public void showSpecifications() {
        System.out.printf("""
                Product: %s
                Price: R$ %.2f
                Quantity in stock: %d""",
                name, price, quantity);
    }

    public static void main(String[] args) {
        Product product1 = new Product("Gamer mouse", 159.9, 25);
        product1.showSpecifications();
    }
}
