package com.example.laba10;

public class OkladException extends Exception {
    private final double oklad;

    public OkladException(double oklad) {
        super("Невозможно создать сотрудника – указан отрицательный оклад: " + oklad);
        this.oklad = oklad;
    }

    public double getOklad() {
        return oklad;
    }
}


