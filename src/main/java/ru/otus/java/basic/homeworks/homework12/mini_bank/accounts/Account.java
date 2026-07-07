package ru.otus.java.basic.homeworks.homework12.mini_bank.accounts;

import java.util.Objects;

public abstract class Account {
    final String number;
    final String currency;
    double remainingFunds;

    public Account(String number, String currency, double remainingFunds) {
        this.number = number;
        this.currency = currency;
        this.remainingFunds = remainingFunds;
    }


    public abstract boolean transition(double money, Account account);

    public void add(double money) {
        remainingFunds += money;
    }

    public String getNumber() {
        return number;
    }

    public String getCurrency() {
        return currency;
    }

    public void infoRemainingFunds() {
        System.out.println("Остаток счета: " + remainingFunds);
    }

    public double getRemainingFunds() {
        return remainingFunds;
    }

    public boolean checkForBalance(double sum) {
        if (remainingFunds <= 0 || remainingFunds < sum) {
            System.out.println("Перевод не состоялся т.к. на счету недостаточно средств: ");
            infoRemainingFunds();
            return false;
        }
        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Objects.equals(number, account.number) && Objects.equals(currency, account.currency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, currency);
    }

    @Override
    public String toString() {
        return "Account{" +
                "number='" + number + '\'' +
                ", currency='" + currency + '\'' +
                ", remainingFunds=" + remainingFunds +
                '}';
    }
}
