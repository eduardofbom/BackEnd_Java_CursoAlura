package br.com.www.models;

import java.util.ArrayList;
import java.util.List;

public class Item {
    private String name;
    private double price;
    private Integer quantity;

    public Item(String name, double price, Integer quantity) {
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

    public double calculateTotalPrice() {
        return price * quantity;
    }

    public static void main(String[] args) {
        List<Item> items = new ArrayList<>();

        items.add(new Item("Keyboard",120.0,3));
        items.add(new Item("Mouse",60.0,2));

        double sumPrice = 0.0;
        for (Item item : items) {
            sumPrice += item.calculateTotalPrice();
        }

        System.out.println("Total purchase: " + sumPrice);
    }
}
