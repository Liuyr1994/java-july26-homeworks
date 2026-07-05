package ru.otus.java.basic.homeworks.homework11.animal_sports_contest.animal;

public class Horse extends Animal {
    public Horse(String name) {
        super("Лошадка " + name, 20, 1, 150);
    }

    @Override
    public int swim(int distance) {
        int staminaCost = distance * 4;
        if (staminaCost > stamina) {
            System.out.println("Конь не смог преодолеть данную дистанцию не хватило сил(((");
            return -1;
        }
        int duration = swimmingSpeed / distance;
        System.out.println("Конь успешно проплыл дистанцию за " + duration);
        stamina -= staminaCost;
        return duration;
    }
}
