package ru.otus.java.basic.homeworks.homework13.transport;

import ru.otus.java.basic.homeworks.homework13.Move;
import ru.otus.java.basic.homeworks.homework13.Terrain;

import java.util.Objects;

public class Car implements Move {
    private final String model;
    private int fuel;

    public Car(String model, int fuel) {
        this.model = model;
        this.fuel = fuel;
    }


    @Override
    public boolean travel(int distance, Terrain terrain) {
        if (Terrain.DENSE_FOREST == terrain || Terrain.SWAMP == terrain) {
            System.out.println("Машине не может передвигаться по болоту или густому лесу");
            return false;
        }


        int fuelConsumption = Math.toIntExact(Math.round(distance * 1.3));
        if (fuelConsumption > fuel) {
            System.out.println("Машина не может дальше ехать - закончился бензин по среди дороги");
            return false;
        }

        System.out.println("Автомобиль успешно смогу преодолеть дистанцию");
        fuel -= fuelConsumption;
        System.out.println("Бензина осталось: " + fuel);
        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return fuel == car.fuel && Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, fuel);
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", fuel=" + fuel +
                '}';
    }
}
