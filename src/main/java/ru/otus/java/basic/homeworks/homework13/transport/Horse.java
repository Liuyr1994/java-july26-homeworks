package ru.otus.java.basic.homeworks.homework13.transport;

import ru.otus.java.basic.homeworks.homework13.Move;
import ru.otus.java.basic.homeworks.homework13.Terrain;

import java.util.Objects;

public class Horse implements Move {
    private final String nickName;
    private int strength;

    public Horse(String nickName, int strength) {
        this.nickName = nickName;
        this.strength = strength;
    }

    @Override
    public boolean travel(int distance, Terrain terrain) {
        if (Terrain.SWAMP == terrain) {
            System.out.println("Лошадка не может вас катать по болоту");
            return false;
        }

        int effortExpended = Math.toIntExact(Math.round(distance * 1.1));
        if (effortExpended > strength) {
            System.out.println("У лошадки по пути закончились силы(((");
            return false;
        }

        strength -= effortExpended;
        System.out.println("Лошадка успешно преодолела заданную дистанцию");
        return true;
    }

    @Override
    public String toString() {
        return "Horse{" +
                "nickName='" + nickName + '\'' +
                ", strength=" + strength +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Horse horse = (Horse) o;
        return strength == horse.strength && Objects.equals(nickName, horse.nickName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nickName, strength);
    }
}
