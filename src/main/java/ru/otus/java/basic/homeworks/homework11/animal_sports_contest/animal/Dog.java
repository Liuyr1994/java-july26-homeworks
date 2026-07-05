package ru.otus.java.basic.homeworks.homework11.animal_sports_contest.animal;

public class Dog extends Animal {
    public Dog(String name) {
        super("Пес " + name, 12, 2, 100);
    }

    @Override
    public int swim(int distance) {
        int staminaCost = distance * 2;
        if (staminaCost > stamina) {
            System.out.println("Собака не сможет проплыть эту дистанцию потому что у нее не хватит сил(((");
            return -1;
        }

        int duration = swimmingSpeed / distance;
        System.out.println("Собака успешно проплыла дистанцию за " + duration);
        stamina -= staminaCost;
        return duration;
    }
}
