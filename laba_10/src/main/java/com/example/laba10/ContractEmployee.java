package com.example.laba10;

public class ContractEmployee extends Employee {
    public ContractEmployee(String fullName, String position, double salary) throws OkladException {
        super(fullName, position, salary);
    }

    @Override
    public double calculateSalary() {
        try {
            return getSalary();
        } catch (Exception ex) {
            System.out.println("Ошибка расчёта зарплаты (контракт): " + ex.getMessage());
            return 0.0;
        }
    }
}


