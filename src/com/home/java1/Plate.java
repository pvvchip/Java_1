package com.home.java1;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void info() {
        System.out.println("plate: " + food);
        System.out.println();
    }

    public void decreaseFood(int n) {
        if ((food - n) < 0) {
            System.out.println("В тарелке мало еды: " + food);
            return;
        }
        food -=n;
    }

    public int getFood() {
        return food;
    }
    public void put(int n) {
        food += n;
        System.out.println("Put: " + n);
        System.out.println("Plate: " + food);
        System.out.println();
    }
}
