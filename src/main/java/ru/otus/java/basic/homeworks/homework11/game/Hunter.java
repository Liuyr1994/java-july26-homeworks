package ru.otus.java.basic.homeworks.homework11.game;

public class Hunter extends Character {
    public Hunter(String name, int health, int power) {
        super(name, health, power);
    }

    @Override
    public void attack() {
        System.out.println("Выстрелил из лука и выпустил стрелу которая нанесла: " + power + " урона.");
    }
}
