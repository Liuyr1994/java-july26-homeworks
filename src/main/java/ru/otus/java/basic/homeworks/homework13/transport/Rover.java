package ru.otus.java.basic.homeworks.homework13.transport;

import ru.otus.java.basic.homeworks.homework13.Move;
import ru.otus.java.basic.homeworks.homework13.Terrain;

import java.util.Objects;

public class Rover implements Move {
    private final String model;
    private int fuel;

    public Rover(String model, int fuel) {
        this.model = model;
        this.fuel = fuel;
    }

    @Override
    public boolean travel(int distance, Terrain terrain) {
        int fuelConsumption = Math.toIntExact(Math.round(distance * 1.9));
        if (fuelConsumption > fuel) {
            System.out.println("Вездеход не может дальше ехать - закончился бензин по среди дороги");
            return false;
        }

        System.out.println("Вездеход успешно смогу преодолеть дистанцию");
        fuel -= fuelConsumption;
        System.out.println("Бензина осталось: " + fuel);
        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Rover rover = (Rover) o;
        return fuel == rover.fuel && Objects.equals(model, rover.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, fuel);
    }

    @Override
    public String toString() {
        return "Rover{" +
                "model='" + model + '\'' +
                ", fuel=" + fuel +
                '}';
    }
}
