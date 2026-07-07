package ru.otus.java.basic.homeworks.homework12.mini_bank.clients;

import ru.otus.java.basic.homeworks.homework12.mini_bank.accounts.Account;
import ru.otus.java.basic.homeworks.homework12.mini_bank.accounts.DebitAccount;

import java.util.ArrayList;
import java.util.List;

public class Client {
    private String name;
    private String fullName;
    private List<Account> accounts;
    private Account account;

    public Client(String name, String fullName) {
        this.name = name;
        this.fullName = fullName;
        this.accounts = new ArrayList<>();
        account = new DebitAccount("SDJFERIF123439485932", "USD");
    }

    public void openNewAccount(Account account) {
        accounts.add(account);
        System.out.println("Аккаунт успешно создан");
    }

    public void closeAccount(Account account) {
        if (!accounts.contains(account)) {
            System.out.println("Аккаунт не найден");
            return;
        }

        accounts.remove(account);
        System.out.println("Аккаунт успешно удален");
    }

    public Account findAccount(String number) {
        for (Account acc : accounts) {
            if (acc.getNumber().equals(number)) {
                System.out.println("Аккаунт успешно найден");
                return acc;
            }
        }
        System.out.println("Не удалось найти аккаунт");
        return null;
    }

    public boolean transition(int money, String number) {
        Account checkAccount = findAccount(number);
        if (checkAccount == null) {
            System.out.println("У вас нету такого аккаунта - проверьте правильно ввода!");
            return false;
        }

        if (this.account.transition(money, checkAccount)) {
            System.out.println("Транзакция успешно проведена");
            return true;
        }
        System.out.println("Транзакция не выполнена");
        return false;
    }

    public void info() {
        for (Account acc : accounts) {
            System.out.println(acc.toString());
        }
    }
}
