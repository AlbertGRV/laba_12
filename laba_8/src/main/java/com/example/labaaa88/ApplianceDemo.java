package com.example.labaaa88;

public class ApplianceDemo {
    
    public static void main(String[] args) {

        Appliance microwave = new Microwave();
        Appliance toaster = new Toaster();

        microwave.turnOn();
        toaster.turnOn();
    }
}
