package ru.otus.java.basic.homeworks.homework15.employees;

import java.util.ArrayList;
import java.util.List;

public class EmployeeUtils {
    public List<String> listOfNames(List<Employee> employees) {
        List<String> names = new ArrayList<>(employees.size());

        for (Employee employee : employees) {
            String name = employee.getName();
            names.add(name);

        }

        return names;
    }

    public List<Employee> filterByMinAge(List<Employee> employees, int minAge) {
        List<Employee> result = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getAge() > minAge) {
                result.add(employee);
            }
        }
        return result;
    }

    public boolean isAverageAgeGreater(List<Employee> employees, int minimumAverageAge) {
        int averageAge = 0;
        for (Employee employee : employees) {
            averageAge += employee.getAge();
        }

        averageAge /= employees.size();

        return averageAge > minimumAverageAge;
    }

    public Employee getYoungestEmployee(List<Employee> employees) {
        Employee youngEmployee = employees.getFirst();
        for (int i = 1; i < employees.size(); i++) {
            if (youngEmployee.getAge() > employees.get(i).getAge()) {
                youngEmployee = employees.get(i);
            }
        }
        return youngEmployee;
    }

    public Employee nameSearch(List<Employee> employees, String name) {
        Employee employee = null;
        for (Employee employee1 : employees) {
            if (employee1.getName().equals(name)) {
                employee = employee1;
                return employee;
            }
        }
        
        return null;
    }
}
