package ru.otus.java.basic.homeworks.homework12.rpg.gamer;

import ru.otus.java.basic.homeworks.homework12.rpg.inventory.Item;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    private int healthPoint;
    private int maximumWeightCarried;
    private List<Item> items;

    public Player(String name, int maximumWeightCarried) {
        this.name = name;
        this.healthPoint = 100;
        this.maximumWeightCarried = maximumWeightCarried;
        this.items = new ArrayList<>();
    }

    public void pickUp(Item item) {
        if ((totalCostOfItems() + item.getWeight()) > maximumWeightCarried) {
            System.out.println("Мы не можем добавить предмет в инвентарь т.к. сумка переполнена");
            return;
        }

        items.add(item);
        System.out.println("Игрок успешно подобрал предмет");

    }

    public void discard(Item item) {
        if (!items.contains(item)) {
            System.out.println("Данного предмета нету в нашем инвентаре");
            return;
        }
        items.remove(item);
        System.out.println("Предмет успешно удален");
    }

    public void infoInventory() {
        System.out.println(items);
    }

    public int calculateTheTotalWeight() {
        if (checkForInventoryNull()) {
            System.out.println("Наш инвентарь пока пуст");
            return -1;
        }

        int fullWeight = 0;
        for (Item i : items) {
            fullWeight += i.getWeight();
        }
        System.out.println("Общий вес вещей в нашем инвентаре = " + fullWeight);
        return fullWeight;
    }

    public int totalCostOfItems() {
        if (checkForInventoryNull()) {
            System.out.println("Наш инвентарь пока пуст");
            return -1;
        }

        int fullSum = 0;
        for (Item i : items) {
            fullSum += i.getPrice();
        }
        System.out.println("Общая сума = " + fullSum);
        return fullSum;
    }

    private boolean checkForInventoryNull() {
        return items.isEmpty();
    }
}
