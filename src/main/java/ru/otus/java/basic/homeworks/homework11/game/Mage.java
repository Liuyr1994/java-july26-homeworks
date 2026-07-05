package ru.otus.java.basic.homeworks.homework11.game;

public class Mage extends Character {
    public Mage(String name, int health, int power) {
        super(name, health, power);
    }

    @Override
    public void attack() {
        System.out.println("Скастил заклинание которое нанесло: " + power + " урона.");
    }
}
