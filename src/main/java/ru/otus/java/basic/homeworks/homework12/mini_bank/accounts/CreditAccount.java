package ru.otus.java.basic.homeworks.homework12.mini_bank.accounts;

public class CreditAccount extends Account {
    public CreditAccount(String number, String currency) {
        super(number, currency, 0);
    }

    @Override
    public boolean transition(double money, Account account) {
        return false;
    }
}
