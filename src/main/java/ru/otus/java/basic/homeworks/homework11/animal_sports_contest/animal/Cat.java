package ru.otus.java.basic.homeworks.homework11.animal_sports_contest.animal;

public class Cat extends Animal {
    public Cat(String name) {
        super("Кот " + name, 14, 0, 15);
    }

    @Override
    public int swim(int distance) {
        System.out.println("Кот не умеет плавать");
        return -1;
    }
}
