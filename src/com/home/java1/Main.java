package com.home.java1;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        1. Написать программу, которая загадывает случайное число от 0 до 9, и пользователю дается 3 попытки угадать
//          это число. При каждой попытке компьютер должен сообщить больше ли указанное пользователем число чем загаданное,
//          или меньше. После победы или проигрыша выводится запрос – «Повторить игру еще раз?
//          1 – да / 0 – нет»(1 – повторить, 0 – нет).

        Random rnd = new Random();
        Scanner scan = new Scanner(System.in);
        int in, intRnd, choice;
        do {
            intRnd = rnd.nextInt(10);
            System.out.println("Угадай число от 0 до 9.");
            for (int i = 0; i < 3; i++) {
                System.out.println("Введи число: ");
                in = scan.nextInt();
                if (in > intRnd) {
                    System.out.println("Число меньше.");
                } else if (in < intRnd) {
                    System.out.println("Число больше.");
                } else {
                    System.out.println("Угадал. Загадано число " + intRnd + ".");
                    break;
                }
            }
            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет.");
            choice = scan.nextInt();
        } while (choice == 1);
    }
}
