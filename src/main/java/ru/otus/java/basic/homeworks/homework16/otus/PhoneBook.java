package ru.otus.java.basic.homeworks.homework16;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PhoneBook {
    private Map<String, Set<String>> contactList;

    public PhoneBook() {
        contactList = new HashMap<>();
    }

    public void add(String name, String phone) {
        if (!contactList.containsKey(name)) {
            Set<String> phoneNumberList = new HashSet<>();
            phoneNumberList.add(phone);
            contactList.put(name, phoneNumberList);
            System.out.println("В справочник успешно добавлен новый пользователь и его номер");
            return;
        }

        contactList.get(name).add(phone);
        System.out.println("Успешно добавлен новый номер телефона");
    }

    public void find(String name) {
        if (!contactList.containsKey(name)) {
            System.out.println("Данный пользователь не найден");
            return;
        }

        for (Map.Entry<String, Set<String>> entry : contactList.entrySet()) {
            if (entry.getKey().equals(name)) {
                System.out.println(entry.getValue());
            }
        }
    }

    public boolean containsPhoneNumber(String phone) {
        for (Map.Entry<String, Set<String>> entry : contactList.entrySet()) {
            Set<String> values = entry.getValue();
            for (String number : values) {
                if (phone.equals(number)) {
                    return true;
                }
            }
        }

        return false;
    }
}
