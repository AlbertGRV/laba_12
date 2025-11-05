package com.example;

import com.example.domain.Admin;
import com.example.domain.Director;
import com.example.domain.Engineer;
import com.example.domain.Employee;
import com.example.domain.Manager;

public class EmployeeTest {
    public static void main(String[] args) {
        Engineer eng = new Engineer(101, "Abobus Antonovich", "012-34-5678", 120_345.27);
        Manager mgr = new Manager(207, "Varvara Jonson", "054-12-2367", 109_501.36, "RB Marketing");
        Admin adm = new Admin(304, "Alexandr Petrovich", "108-23-2367", 75_002.34);
        Director dir = new Director(12, "lol kekovich", "099-45-2340", 120_567.36, "Worldwide Marketing", 1_000_000.00);

        printEmployee(eng);
        printEmployee(mgr);
        printEmployee(adm);
        printEmployee(dir);
    }

    private static void printEmployee(Employee emp) {
        System.out.println("Employee ID: " + emp.getEmpId());
        System.out.println("Имя работника: " + emp.getName());
        System.out.println("СНИЛС рабортника # " + emp.getSsn());
        System.out.println("Зарплата работника: " + emp.getSalary());
        System.out.println("---");
    }
}


