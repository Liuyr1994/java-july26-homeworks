package ru.otus.java.basic.homeworks.homework11.transport;

public class Boat extends Transport {
    public Boat(String title, int maxSpeed, int fuelQuantity) {
        super("Лодка " + title, maxSpeed, fuelQuantity);
    }

    @Override
    public void driveCertainDistance(int distance) {
        int amountFuelConsumed = (int) (distance * 0.05);
        if (fuelQuantity < amountFuelConsumed) {
            System.out.println("У лодки нехватка топлива для преодоления такой дистанции");
            return;
        }
        fuelQuantity -= amountFuelConsumed;
    }
}
