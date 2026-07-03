package ru.otus.java.basic.homeworks.homework10.user;

public class MainApplication {
    public static void main(String[] args) {
        User[] users = {
                new User("Bessonov", "Henadzi", "Aleksandrovich", 1994, "s.client@mail.ru"),
                new User("Bessonov", "Henadzi", "Aleksandrovich", 1994, "s.client@mail.ru"),
                new User("Bessonov", "Henadzi", "Aleksandrovich", 1994, "s.client@mail.ru"),
                new User("Bessonov", "Henadzi", "Aleksandrovich", 1994, "s.client@mail.ru"),
                new User("Bessonov", "Henadzi", "Aleksandrovich", 1994, "s.client@mail.ru")
        };

        for (int i = 0; i < users.length; i++) {
            if (2026 - users[i].getYearOfBirth() > 40) {
                System.out.println(users[i]);
            }
        }
    }
}
