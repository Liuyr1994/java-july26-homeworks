package ru.otus.java.basic.homeworks.homework12.mini_bank.accounts;

public class DebitAccount extends Account {

    public DebitAccount(String number, String currency) {
        super(number, currency, 0);
    }

    @Override
    public boolean transition(double money, Account account) {
        if (remainingFunds <= 0 || remainingFunds < money) {
            System.out.println("Перевод не состоялся т.к. на счету недостаточно средств: ");
            infoRemainingFunds();
            return false;
        }

        if (this.equals(account)) {
            System.out.println("Нельзя переводить с одного и того же аккаунт на тот же аккаунт средства");
            return false;
        }

        if (!currency.equals(account.getCurrency())) {
            if (!checkForBalance(remainingFunds + (account.getRemainingFunds() * 0.05))) {
                return false;
            }
        }
        account.add(money);
        remainingFunds -= money;
        System.out.println("Перевод успешно выполнен");
        return true;
    }
}



