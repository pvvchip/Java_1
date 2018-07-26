package com.home.java1;

import java.util.Random;
import java.util.Scanner;

public class Main {
    private static char[][] map = new char[5][5];
    private static Scanner scanner = new Scanner(System.in);
    private static Random rnd = new Random();

    public static void main(String[] args) {
//        1. Полностью разобраться с кодом, попробовать переписать с нуля, стараясь не подглядывать в методичку;
//        2. Переделать проверку победы, чтобы она не была реализована просто набором условий, например,
//                с использованием циклов.
//        3. * Попробовать переписать логику проверки победы, чтобы она работала для поля 5х5 и
//        количества фишек 4. Очень желательно не делать это просто набором условий для каждой из возможных ситуаций;
//        4. *** Доработать искусственный интеллект, чтобы он мог блокировать ходы игрока.

        initMap();  //    инициализация игравого поля
        printMap(); //    печать игравого поля

        while (true) {
            humanTurn();
            printMap();
            if (checkWin('X')) break;
            if (fullMap()) break;
            aiTurn();
            printMap();
            if (checkWin('C')) break;
            if (fullMap()) break;
        }
        System.out.println("Конец игры.");
    }

    private static boolean checkWin(char ch) {
        String win = new String();
        String col = new String();
        if (ch == 'X') win = "XXXX";
        if (ch == 'C') win = "CCCC";

        //   горизонтали
        for (int i = 0; i < map.length; i++) {
            if (String.valueOf(map[i]).indexOf(win) >= 0) {
                System.out.println("Победа " + ((ch == 'X') ? "Человека" : "Машины"));
                return true;
            }
        }
//        //   вертикали

        for (int i = 0; i < map.length; i++) {
            for (int row = 0; row < map.length; row++) {
                col[row] = String.valueOf(map[row][i]);
            }
            if (String.valueOf(col).indexOf(win) >= 0) {
                System.out.println("Победа " + ((ch == 'X') ? "Человека" : "Машины"));
                return true;
            }
        }
        //   диоганали
        for (int i=0;i<10;i++){
            for (int j=0;j<10;j++){

            }
        }

        return false;
    }

    private static boolean fullMap() {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (map[i][j] == '*') return false;
            }
        }
        return true;
    }

    private static void aiTurn() {
        int x, y;
        System.out.println("Ход ai");
        do {
            x = rnd.nextInt(5);
            y = rnd.nextInt(5);
        } while (map[x][y] != '*');
        map[x][y] = 'C';
        System.out.println(++x + " " + ++y);
    }

    private static void humanTurn() {
        int x, y;
        do {
            System.out.println("Твой ход Х Y");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (x < 0 || x > 4 || y < 0 || y > 4 || map[x][y] != '*');
        map[x][y] = 'X';
        System.out.println();
    }

    //    инициализация игравого поля
    private static void initMap() {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                map[i][j] = '*';
            }
        }
    }

    //    печать игравого поля
    private static void printMap() {
        System.out.println("  1 2 3 4 5");
        for (int i = 0; i < map.length; i++) {
            System.out.print(i + 1 + " ");
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
