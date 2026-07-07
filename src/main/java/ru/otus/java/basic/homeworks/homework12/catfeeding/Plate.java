package ru.otus.java.basic.homeworks.homework12.catfeeding;

public class Plate {
    private int maximumAmountFood;
    private int amountFood;

    public Plate() {
        this.maximumAmountFood = 100;
        amountFood = maximumAmountFood;
    }

    public void add(int food) {
        if (food < 0) {
            System.out.println("Еда не может быть меньше ноля(((");
            return;
        }

        if (food > 100 || (amountFood += food) > 100) {
            amountFood = 100;
            System.out.println("Тарелка полностью заполнилась");
            return;
        }


        amountFood += food;
        System.out.println("Еда успешно добавлена в тарелку. На данный момент в тарелке: " + amountFood);
    }

    public boolean reducing(int amount) {
        if (amount > (amountFood -= amount)) {
            System.out.println("В тарелке меньше еды чем котик хочет скушать((");
            return false;
        }

        if (amount < 0) {
            System.out.println("Коты не могу есть отрицатель(((");
            return false;
        }

        amountFood -= amount;
        System.out.println("Коты успешно покушали");
        return true;
    }

    public int getAmountFood() {
        return amountFood;
    }

    @Override
    public String toString() {
        return "Plate{" +
                "Максимально возможное количество еды в тарелке = " + maximumAmountFood +
                ".\nТекущее количество еды в тарелке =" + amountFood +
                '}';
    }
}
