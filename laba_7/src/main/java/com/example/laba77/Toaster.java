package com.example.laba77;

public class Toaster extends Appliance {

    @Override
    public void turnOn() {
        System.out.println("Тостер включен! Начинается поджаривание хлеба...");
    }
    
    public void printInfo() {
        System.out.println("Тостер - прибор для поджаривания хлеба");
    }
}

