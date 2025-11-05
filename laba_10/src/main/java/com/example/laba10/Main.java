package com.example.laba10;

public class Main {
    public static void main(String[] args) {

        try {
            System.out.println("\n=== Расчет зарплат ===\n");
            
            StaffEmployee se1 = new StaffEmployee("Артем Гаврук", "пукп", -50000, 10000);
            StaffEmployee se2 = new StaffEmployee("Дмитрий Слыш", "Инженер", 60000, 5000);
            ContractEmployee ce1 = new ContractEmployee("Захар Шабуневич", "Конструктор", 70000);

            System.out.println(se1.getFullName() + ": " + se1.calculateSalary());
            System.out.println(se2.getFullName() + ": " + se2.calculateSalary());
            System.out.println(ce1.getFullName() + ": " + ce1.calculateSalary());
            
        } catch (Exception e) {
            System.out.println("Непредвиденная ошибка: " + e.getMessage());
        }
    }
}


