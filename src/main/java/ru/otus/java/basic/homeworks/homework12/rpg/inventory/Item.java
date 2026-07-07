package ru.otus.java.basic.homeworks.homework12.rpg.inventory;

import java.util.Objects;

public abstract class Item {
    String title;
    int weight;
    int price;

    public Item(String title, int weight, int price) {
        this.title = title;
        this.weight = weight;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public int getPrice() {
        return price;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return weight == item.weight && price == item.price && Objects.equals(title, item.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, weight, price);
    }

    @Override
    public String toString() {
        return "Item{" +
                "title='" + title + '\'' +
                ", weight=" + weight +
                ", price=" + price +
                '}';
    }
}
