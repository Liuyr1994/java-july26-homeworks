package ru.otus.java.basic.homeworks.homework11.bank.cards;

public abstract class Card {
    String numberOfCards;
    int balance;

    public Card(String numberOfCards, int balance) {
        this.numberOfCards = numberOfCards;
        this.balance = balance;
    }

    public void add(int replenishment) {
        if (replenishment < 0) {
            System.out.println("Это пополнение а не снятие денег со счета");
            return;
        }
        balance += replenishment;
        System.out.println("Баланс карточки успешно пополнен");
    }

    public void checkBalance() {
        System.out.println("Баланс карты = " + balance);
    }
}
