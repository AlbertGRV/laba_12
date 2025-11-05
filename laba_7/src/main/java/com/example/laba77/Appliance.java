package com.example.laba77;


public abstract class Appliance {

    protected String name;

    protected Appliance() {}

    public Appliance(String name) {
        this.name = name;
        
    }

    public void displayInfo() {
        System.out.println("Информация о приборе");
    }

    public abstract void turnOn();
    

}

