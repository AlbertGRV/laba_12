package com.example.laba77;


public class ApplianceDemo {
    
    public static void main(String[] args) {

        Appliance microwave = new Microwave();
        Appliance toaster = new Toaster();
        Toaster t = new Toaster();
        

        System.out.println("=== Демонстрация работы бытовой техники ===");
        
        System.out.println("\n1. Микроволновая печь:");
        microwave.turnOn();
        
        System.out.println("\n2. Тостер:");
        toaster.turnOn();
        
        System.out.println("\n=== Демонстрация новых методов ===");
        
        System.out.println("\n3. Информация о микроволновой печи:");
        microwave.displayInfo();
        
        System.out.println("\n4. Информация о тостере:");
        toaster.displayInfo();
        toaster.printInfo();

        t.printInfo();
        t.displayInfo();
        
        System.out.println("\n=== Демонстрация завершена ===");
    }
}

