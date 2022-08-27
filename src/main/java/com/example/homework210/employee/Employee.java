package com.example.homework210.employee;

import java.util.Objects;

public class Employee {
    private final String name;
    private final String surname;
    private final int department;
    private final double salary;

    public Employee(String name,
                    String surname,
                    int department,
                    double salary) {
        this.name = name;
        this.surname = surname;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getDepartmentId() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Employee employee = (Employee) o;
        return department == employee.department && Double.compare(employee.salary, salary) == 0 && Objects.equals(name, employee.name) && Objects.equals(surname, employee.salary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, department, salary);
    }

    @Override
    public String toString() {
        return String.format("ФИ: %s %s, отдел: %d, ЗП: %.2f", surname, name, department, salary);
    }
}

