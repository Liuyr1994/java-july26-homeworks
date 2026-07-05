package ru.otus.java.basic.homeworks.homework11.company.company_employees;

public class Tester extends Employee {
    public Tester(String name, int salary) {
        super(name, salary);
    }

    @Override
    public void working() {
        System.out.println("Тестирует код");
    }
}
