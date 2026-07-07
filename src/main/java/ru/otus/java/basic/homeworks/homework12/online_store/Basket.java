package ru.otus.java.basic.homeworks.homework12.online_store;

import java.util.List;

public class Basket {
    private List<Product> products;


    public void add(Product product) {
        products.add(product);
        
    }
}
