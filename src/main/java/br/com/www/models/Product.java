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

    public Product(String name, Integer quantity) {
        this.name = name;
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

    public boolean sale(Integer quantitySold) {
        if (quantitySold > quantity) {
            System.out.println("Insufficient stock!");
            return false;
        } else {
            quantity -= quantitySold;
            System.out.printf("Sale completed! Remaining stock of %s : %d%n", name, quantity);
            return true;
        }
    }

    public static void main(String[] args) {
//        Product product1 = new Product("Gamer mouse", 159.9, 25);
//        product1.showSpecifications();

        Product product2 = new Product("T-Shirt", 10);
        product2.sale(3);
        product2.sale(8);
    }
}
