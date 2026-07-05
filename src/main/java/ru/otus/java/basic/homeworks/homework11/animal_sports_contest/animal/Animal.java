package ru.otus.java.basic.homeworks.homework11.animal_sports_contest.animal;

public abstract class Animal {
    String name;
    int runningSpeed;
    int swimmingSpeed;
    int stamina;

    public Animal(String name, int runningSpeed, int swimmingSpeed, int stamina) {
        this.name = name;
        this.runningSpeed = runningSpeed;
        this.swimmingSpeed = swimmingSpeed;
        this.stamina = stamina;
    }

    public int run(int distance) {
        if (distance > stamina) {
            System.out.println(name + " не смог пробежать дистанцию - устал(((");
            return -1;
        }

        int duration = runningSpeed / distance;
        System.out.println("Успешно пробежал дистанцию в " + distance + "за " + duration);
        stamina -= distance;
        return duration;
    }

    public abstract int swim(int distance);

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", runningSpeed=" + runningSpeed +
                ", swimmingSpeed=" + swimmingSpeed +
                ", stamina=" + stamina +
                '}';
    }
}
