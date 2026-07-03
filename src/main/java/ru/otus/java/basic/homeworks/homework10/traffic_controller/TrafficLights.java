package ru.otus.java.basic.homeworks.homework10.traffic_controller;

public class TrafficLights {
    private String currentColor;
    private boolean status;
    private String[] colors = {
            "Red",
            "Yellow",
            "Green",
            "Yellow"
    };
    private int counter = 0;

    public TrafficLights() {
        this.currentColor = "Red";
        this.status = false;
    }

    public void open() {
        status = true;
        System.out.println("Светофор включен");
    }

    public void close() {
        status = false;
        System.out.println("Светофор выключен");
    }

    public void selector() {
        switch (counter) {
            case 0:
                System.out.println("Сейчас красный");
                counter = 1;
                currentColor = colors[counter];
                break;
            case 1:
                System.out.println("Сейчас желтый");
                counter = 2;
                currentColor = colors[counter];
                break;
            case 2:
                System.out.println("Сейчас зеленый");
                counter = 3;
                currentColor = colors[counter];
                break;
            case 3:
                System.out.println("Сейчас желтый");
                counter = 0;
                currentColor = colors[counter];
                break;
        }
    }

    public static void main(String[] args) {
        TrafficLights trafficLights = new TrafficLights();
        trafficLights.selector();
        trafficLights.selector();
        trafficLights.selector();
        trafficLights.selector();
        trafficLights.selector();
    }
}
