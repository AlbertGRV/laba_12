package com.example.pet;

public class Chameleon {
    private String name;            // private: encapsulated state
    int age;                        // package-private
    protected String color;         // protected: visible to subclasses
    public boolean hungry;          // public field for demo purposes

    public Chameleon() {
        this("NoName", 0, "green", true);
    }

    public Chameleon(String name) {
        this(name, 0, "green", true);
    }

    public Chameleon(String name, int age, String color, boolean hungry) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.hungry = hungry;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void changeColor(String newColor) {
        if (newColor != null && !newColor.isEmpty()) {
            this.color = newColor;
        }
    }

    public void eat(String food) {
        if (hungry) {
            hungry = false;
        }
    }

    private String secretMood() {
        return hungry ? "hungry" : "calm";
    }

    public String describe() {
        return "Chameleon[name=" + name + ", age=" + age + ", color=" + color + ", mood=" + secretMood() + "]";
    }
}


