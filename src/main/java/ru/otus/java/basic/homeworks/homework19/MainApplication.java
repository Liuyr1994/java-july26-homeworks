package ru.otus.java.basic.homeworks.homework19;

public class MainApplication {
    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            String name = Thread.currentThread().getName();
            System.out.println(name);
            for (int i = 0; i < 100; i++) {
                System.out.print(i + " ");
            }
        });
        
    }
}
