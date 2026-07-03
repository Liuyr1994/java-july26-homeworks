package ru.otus.java.basic.homeworks.homework10.box;

public class Box {
    private int size;
    private String color;
    private boolean flag = false;
    private String object;

    public Box(int size, String color) {
        this.size = size;
        this.color = color;
    }

    public void add(String input) {
        if (flag == true && object == null) {
            object += input;
            System.out.println("Успешно положили в коробку предмет");
            return;
        }
        System.out.println("Не смогли выкинуть из коробки предмет");
    }

    public void throwing() {
        if (flag == true && object != null) {
            object = null;
            System.out.println("Успешно выкинули из коробки предмет");
            return;
        }
        System.out.println("Не смогли выкинуть из коробки предмет");
    }


    public void open() {
        flag = true;
        System.out.println("Коробка открыта");
    }

    public void closed() {
        flag = false;
        System.out.println("Коробка закрыта");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public boolean isFlag() {
        return flag;
    }

    @Override
    public String toString() {
        return "Box{" +
                "size=" + size +
                ", color='" + color + '\'' +
                ", flag=" + flag +
                ", object='" + object + '\'' +
                '}';
    }
}
