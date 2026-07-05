package ru.otus.java.basic.homeworks.homework11.transport;

public class Car extends Transport {
    public Car(String title, int maxSpeed, int fuelQuantity) {
        super("Машина марки " + title, maxSpeed, fuelQuantity);
    }

    @Override
    public void driveCertainDistance(int distance) {
        int amountFuelConsumed = (int) (distance * 0.1);
        if (fuelQuantity < amountFuelConsumed) {
            System.out.println("У машины нехватка топлива для преодоления такой дистанции");
            return;
        }
        fuelQuantity -= amountFuelConsumed;
    }
}
