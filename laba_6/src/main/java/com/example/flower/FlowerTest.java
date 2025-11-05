package com.example.flower;

public class FlowerTest {
    public static void main(String[] args) {
        Flower flower = new Flower("красный", "розовый", 6);
        flower.printBudColor();
        System.out.println("Лепестков: " + flower.getPetalCount());
        System.out.println("Открыт? " + flower.isOpen());
        flower.bloom();
        System.out.println("После расцветания. Открыт? " + flower.isOpen());
        flower.wither();
        System.out.println("После увядания. Открыт? " + flower.isOpen());
    }
}


