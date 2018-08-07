package com.home.java1;

class Dog extends Animal {

    private void init(){
        this.limitSwim = 10;
        this.limitJump = 0.5f;
    }

    Dog() {
        init();
        this.limitRun = 500;
    }

    Dog(int limitRun) {
        init();
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
