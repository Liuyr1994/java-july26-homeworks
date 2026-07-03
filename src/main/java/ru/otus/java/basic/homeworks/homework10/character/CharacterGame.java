package ru.otus.java.basic.homeworks.homework10.character;

public class CharacterGame {
    private String name;
    private int hp;
    private double attackPower;

    public CharacterGame(String name, int hp, double attackPower) {
        this.name = name;
        this.hp = hp;
        this.attackPower = attackPower;
    }

    public double attack() {
        System.out.println("Успешно нанесли герою уроне в размере: " + attackPower);
        return attackPower;
    }

    public void takeDamage(int attack) {
        if (attack > hp) {
            System.out.println("Герой убит");
            return;
        }
        hp -= attack;
        System.out.println("Нанесли герою урона: " + attack + ". У героя осталось здоровья: " + hp);
    }

    public void treatment(int healing) {
        hp += healing;
        System.out.println("Герой вылечил здоровья в размере: " + healing + ". Текущие здоровье героя: " + hp);
    }

    @Override
    public String toString() {
        return "CharacterGame{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                ", attackPower=" + attackPower +
                '}';
    }
}
