package ru.otus.java.basic.homeworks.homework10.online_store;

public class Product {
    private String title;
    private double price;
    private int amount;


    public Product(String title, double price, int amount) {
        this.title = title;
        this.price = price;
        this.amount = amount;
    }

    public void change(double price) {
        this.price = price;
        System.out.println("Успешно изменили цену");
    }

    public void add(int count) {
        amount += count;
        System.out.println("Успешно добавили новое количество товара");
    }

    public void sale(int count) {
        if (count > amount) {
            System.out.println("У нас нету такого количества данного товара");
            return;
        }
        double fullPrice = price * count;
        System.out.println("Общая цена за количество " + count + " товара = " + fullPrice);
        amount -= count;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public int getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Product{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                '}';
    }
}
