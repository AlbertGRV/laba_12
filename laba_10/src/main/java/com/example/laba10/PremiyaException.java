package com.example.laba10;

public class PremiyaException extends Exception {
    public PremiyaException(double premia) {
        super("Премия не может быть отрицательной: " + premia);
    }
}


