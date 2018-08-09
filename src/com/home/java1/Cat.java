package com.home.java1;

class Cat extends Animal {

    Cat() {
        this.limitRun = 200;
        this.limitJump = 2f;
    }

    @Override
    void run(int length) {
        if (length > limitRun) {
            System.out.println("Кошка больше 200м. бежать неможет.");
            return;
        }
        System.out.print("Кошка ");
        super.run(length);
    }

    @Override
    void jump(float height) {
        if (height > limitJump) {
            System.out.println("Кот больше 2м. прыгать неможет.");
            return;
        }
        System.out.print("Кошка ");
        super.jump(height);
    }

    @Override
    void swim(int length) {
        System.out.println("Кошка плавать не умеет.");
    }
}
