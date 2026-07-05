package ru.otus.java.basic.homeworks.homework11.game;

public abstract class Character {
    String name;
    int health;
    int power;

    public Character(String name, int health, int power) {
        this.name = name;
        this.health = health;
        this.power = power;
    }

    public abstract void attack();


    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", power=" + power +
                '}';
    }
}
