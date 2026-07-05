package ru.otus.java.basic.homeworks.homework11.company.company_employees;

public class Programmer extends Employee {
    public Programmer(String name, int salary) {
        super(name, salary);
    }

    @Override
    public void working() {
        System.out.println("Программист пишет код");
    }
}
