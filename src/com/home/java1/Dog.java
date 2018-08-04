package com.home.java1;

public class Dog extends Animals {
    private int limitRun;
    private final float limitJump = 0.5f;
    private final int limitSwim = 10;

    public Dog() {
        this.limitRun = 500;
    }

    public Dog(int limitRun) {
        this.limitRun = limitRun;
    }

    @Override
    void run(int length) {
        if (length > limitRun) {
            System.out.println("Собака больше " + limitRun + "м. бежать неможет.");
            return;
        }
        System.out.print("Собака ");
        super.run(length);
    }

    @Override
    void jump(float height) {
        if (height > limitJump) {
            System.out.println("Собака больше 0.5м. прыгать неможет.");
            return;
        }
        System.out.print("Собака ");
        super.jump(height);
    }

    @Override
    void swim(int length) {
        if (length > limitSwim) {
            System.out.println("Собака больше 10м. плыть неможет.");
            return;
        }
        System.out.print("Собака ");
        super.swim(length);
    }
}
