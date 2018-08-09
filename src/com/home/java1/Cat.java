package com.home.java1;

import java.util.Random;

public class Cat {
    private String name;
    private int appetite;
    private boolean satisfaid;
    static int i = 1;

    public Cat() {
        Random rnd = new Random();
        this.name = "Cat_" + String.valueOf(i++);
        this.appetite = rnd.nextInt(6) + 1;
        this.satisfaid = false;
    }

    public void eat(Plate p) {
        System.out.println(name + " хочет съесть: " + appetite);
        if (p.getFood() >= appetite) satisfaid = true;
        p.decreaseFood(appetite);
        System.out.println(name + " satisfaid:\t" + satisfaid);
        System.out.println();
    }

    public void info() {
        System.out.println("Name:\t\t" + name);
        System.out.println("Appetite:\t" + appetite);
        System.out.println("Satisfaid:\t" + satisfaid);
        System.out.println();
    }
}
