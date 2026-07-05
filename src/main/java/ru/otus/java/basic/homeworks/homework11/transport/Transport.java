package ru.otus.java.basic.homeworks.homework11.transport;

public abstract class Transport {
    String title;
    int maxSpeed;
    int fuelQuantity;

    public Transport(String title, int maxSpeed, int fuelQuantity) {
        this.title = title;
        this.maxSpeed = maxSpeed;
        this.fuelQuantity = fuelQuantity;
    }

    public void refueling(int quantity) {
        if (quantity < 0) {
            System.out.println("Топлива не может быть меньше 0");
            return;
        }
        fuelQuantity += quantity;
    }

    public abstract void driveCertainDistance(int distance);

    @Override
    public String toString() {
        return "Transport{" +
                "title='" + title + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", feeQuantity=" + fuelQuantity +
                '}';
    }
}
