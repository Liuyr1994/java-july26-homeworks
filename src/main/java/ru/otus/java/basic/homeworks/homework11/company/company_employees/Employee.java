package ru.otus.java.basic.homeworks.homework11.company.company_employees;

public abstract class Employee {
    String name;
    int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public abstract void working();
}
