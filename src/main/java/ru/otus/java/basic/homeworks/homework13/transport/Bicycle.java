package ru.otus.java.basic.homeworks.homework13.transport;

import ru.otus.java.basic.homeworks.homework13.Move;
import ru.otus.java.basic.homeworks.homework13.Terrain;

import java.util.Objects;

public class Bicycle implements Move {
    private final String model;
    private int humanStrength;
    private int energyRiding;

    public Bicycle(String model, int humanStrength) {
        this.model = model;
        this.humanStrength = humanStrength;
    }


    @Override
    public boolean travel(int distance, Terrain terrain) {
        if (Terrain.SWAMP == terrain) {
            System.out.println("Велосипед не может перемещаться по болоту");
            return false;
        }

        energyRiding = Math.toIntExact(Math.round(distance * 1.2));

        if (humanStrength < energyRiding) {
            System.out.println("Человеку не хватило сил что-бы преодолеть заданную дистанцию");
            return false;
        }

        humanStrength -= energyRiding;

        System.out.println("Человек успешно преодолел данную дистанцию");
        return true;
    }

    public int getEnergyRiding() {
        return energyRiding;
    }

    public void setEnergyRiding(int energyRiding) {
        this.energyRiding = energyRiding;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Bicycle bicycle = (Bicycle) o;
        return humanStrength == bicycle.humanStrength && Objects.equals(model, bicycle.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, humanStrength);
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "model='" + model + '\'' +
                ", humanStrength=" + humanStrength +
                ", energyRiding=" + energyRiding +
                '}';
    }
}
