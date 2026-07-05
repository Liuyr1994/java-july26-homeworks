package ru.otus.java.basic.homeworks.homework11.company.company_employees;

public class Manager extends Employee {
    public Manager(String name, int salary) {
        super(name, salary);
    }

    @Override
    public void working() {
        System.out.println(name + "Проводит совещание");
    }
}
