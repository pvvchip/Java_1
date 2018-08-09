package com.home.java1;

class Animal {
    int limitRun;
    float limitJump;
    int limitSwim;

    void run(int length){
        System.out.println("пробежала " + length + "м.");
    }

    void swim(int length) {
        System.out.println("проплыла " + length + "м.");
    }

    void jump(float height) {
        System.out.println("прыгнула " + height + "м.");
    }

}
