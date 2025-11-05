package com.example.flower;

public class Flower {
    private final Petal[] petals;
    private final Bud bud;

    public Flower(String budColor, String petalColor, int petalCount) {
        this.petals = new Petal[petalCount];
        for (int i = 0; i < petalCount; i++) {
            this.petals[i] = new Petal(petalColor);
        }
        this.bud = new Bud(budColor);
    }

    public void bloom() {
        bud.bloom();
    }

    public void wither() {
        bud.wither();
    }

    public void printBudColor() {
        System.out.println("Цвет бутона: " + bud.getColor());
    }

    public boolean isOpen() {
        return bud.isOpen();
    }

    public int getPetalCount() {
        return petals.length;
    }
}


