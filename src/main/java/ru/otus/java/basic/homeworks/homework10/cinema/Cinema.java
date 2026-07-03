package ru.otus.java.basic.homeworks.homework10.cinema;

public class Cinema {
    private String movieName;
    private int numberOfAvailableSeats;
    private final int maxNumberOfAvailableSeats;
    private double cost;

    public Cinema(String movieName, double cost) {
        this.movieName = movieName;
        maxNumberOfAvailableSeats = 122;
        numberOfAvailableSeats = maxNumberOfAvailableSeats;
        this.cost = cost;
    }

    public double buyTickets(int countTickets) {
        if (countTickets > numberOfAvailableSeats) {
            System.out.println("Мест меньше чем количество билетов которые вы хотите купить");
            return 0;
        }

        double price = countTickets * cost;
        System.out.println("Итоговая сумма: " + price);
        numberOfAvailableSeats -= countTickets;
        return price;
    }

    public double refundTickets(int countTickets) {
        double price = (countTickets * cost) * 0.8;
        System.out.println("Билеты возвращаются по сниженной стоимости " + price);
        return price;
    }

    public void info() {
        System.out.println("Фильм называется: " + movieName + ".\nЦена за билет на фильм: " + cost);
    }

    public double amountTicketSales() {
        double price = (maxNumberOfAvailableSeats - numberOfAvailableSeats) * cost;
        System.out.println("Было заработана за этот сеанс на продаже билетов: " + price);
        return price;
    }
}
