package ru.otus.java.basic.homeworks.homework12.online_store;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Order {
    private String number;
    private List<Product> products;
    private String data;
    private double cost;

    public Order(String number, List<Product> products, double cost) {
        this.number = number;
        this.products = products;
        this.cost = cost;
        data = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss"));
    }

    public void add(Product product) {
        products.add(product);
        System.out.println("Товар успешно добавлен");
    }


    @Override
    public String toString() {
        return "Order{" +
                "number='" + number + '\'' +
                ", products=" + products +
                ", data='" + data + '\'' +
                ", cost=" + cost +
                '}';
    }
}
