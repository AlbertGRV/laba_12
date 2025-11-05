package com.example.pet;

public class PetDemo {
    public static void main(String[] args) {
        Chameleon c1 = new Chameleon();
        Chameleon c2 = new Chameleon("Хамми", 2, "зелёный", true);

        c1.setName("Камми");
        c1.changeColor("коричневый");
        c2.eat("муха");

        System.out.println(c1.describe());
        System.out.println(c2.describe());
    }
}


