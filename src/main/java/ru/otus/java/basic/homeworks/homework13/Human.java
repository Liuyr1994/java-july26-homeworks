package ru.otus.java.basic.homeworks.homework13;

public class Human {
    private String name;
    private Move currentTransport;
    private int humanStrength;

    public Human(String name, Move currentTransport, int humanStrength) {
        this.name = name;
        this.currentTransport = currentTransport;
        this.humanStrength = humanStrength;
    }

    public void getOnATransport(Move transport) {
        if (currentTransport == null) {
            System.out.println("Посадите человека на транспорт");
            return;
        }

        currentTransport = transport;
        System.out.println("Человек успешно сел на транспорт: " + transport);
    }

    public void getOffTransport() {
        if (currentTransport == null) {
            System.out.println("Человек и так не на транспорте");
            return;
        }

        currentTransport = null;
        System.out.println("Человек успешно встал с транспорта");
    }

    public boolean travelTo(int distance, Terrain terrain) {
        int effortExpended = Math.toIntExact(Math.round(distance * 1.9));
        if (currentTransport == null && humanStrength > effortExpended) {
            System.out.println("Человек успешно преодолел данную дистанцию: " + distance + " пешком");
            humanStrength -= effortExpended;
            return true;
        }

        assert currentTransport != null;
        return currentTransport.travel(distance, terrain);
    }
}
