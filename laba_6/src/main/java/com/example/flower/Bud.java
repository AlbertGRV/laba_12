package com.example.flower;

public class Bud {
    private String color;
    private boolean open;

    public Bud(String color) {
        this.color = color;
        this.open = false;
    }

    public void bloom() {
        open = true;
    }

    public void wither() {
        open = false;
    }

    public String getColor() {
        return color;
    }

    public boolean isOpen() {
        return open;
    }
}


