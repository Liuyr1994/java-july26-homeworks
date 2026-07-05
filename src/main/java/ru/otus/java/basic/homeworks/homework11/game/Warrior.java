package ru.otus.java.basic.homeworks.homework11.game;

public class Warrior extends Character {
    public Warrior(String name, int health, int power) {
        super(name, health, power);
    }

    @Override
    public void attack() {
        System.out.println("Взмахнул тяжелым топором и нанес удар: " + power);
    }
}
