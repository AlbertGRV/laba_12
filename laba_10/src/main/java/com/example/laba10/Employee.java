package com.example.laba10;

public class Employee {
    private String fullName;
    private String position;
    private double salary;

    public Employee(String fullName, String position, double salary) throws OkladException {
        if (fullName == null || fullName.trim().isEmpty()) {
            throw new IllegalArgumentException("ФИО не может быть пустым");
        }
        if (position == null || position.trim().isEmpty()) {
            throw new IllegalArgumentException("Должность не может быть пустой");
        }
        if (salary < 0) {
            OkladException ex = new OkladException(salary);
            System.out.println("Невозможно создать сотрудника – указан отрицательный оклад: " + salary);
            throw ex;
        }
        this.fullName = fullName;
        this.position = position;
        this.salary = salary;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        if (fullName == null || fullName.trim().isEmpty()) {
            throw new IllegalArgumentException("ФИО не может быть пустым");
        }
        this.fullName = fullName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        if (position == null || position.trim().isEmpty()) {
            throw new IllegalArgumentException("Должность не может быть пустой");
        }
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary < 0) {
            throw new IllegalArgumentException("Оклад не может быть отрицательным");
        }
        this.salary = salary;
    }

    public double calculateSalary() {
        return salary;
    }
}


