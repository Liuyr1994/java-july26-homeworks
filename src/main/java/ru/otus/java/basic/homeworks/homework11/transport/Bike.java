package ru.otus.java.basic.homeworks.homework11.transport;

public class Bike extends Transport {
    public Bike(String title, int maxSpeed, int fuelQuantity) {
        super("Мотоцикл " + title, maxSpeed, fuelQuantity);
    }

    @Override
    public void driveCertainDistance(int distance) {
        int amountFuelConsumed = (int) (distance * 0.2);
        if (fuelQuantity < amountFuelConsumed) {
            System.out.println("У мотоцикла нехватка топлива для преодоления такой дистанции");
            return;
        }
        fuelQuantity -= amountFuelConsumed;
    }
}
