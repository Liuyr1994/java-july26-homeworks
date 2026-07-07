package ru.otus.java.basic.homeworks.homework12.catfeeding;

public class Cat {
    private String name;
    private int maxAppetite;
    private int appetite;
    private boolean satiety = false;

    public Cat(String name) {
        this.name = name;
        this.maxAppetite = 25;
        this.appetite = 0;
    }

    public int eat() {
        if (satiety == true) {
            return 0;
        }
        satiety = true;
        return appetite;
    }


    public boolean isSatiety() {
        return satiety;
    }

    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }
}
