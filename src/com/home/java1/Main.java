package com.home.java1;

public class Main {

    public static void main(String[] args) {
        byte Byte = 127;
        short Short = 22767;
        int Int = 2147483647;
        long Long = 92L;
        float Float = 126.3f;
        double Doouble = 12.42356;
        boolean Boolean = true;
        char Char = 'A';
        String text = "Привет";
    }

    private static float calc(float a, float b, float c, float d){
        if (d == 0){
            System.out.println("ОШИБКА: Параметр d=0, деление на ноль.");
            return 0;
        }
        return a * (b + (c / d));
    }

    private static boolean calcBool (int a, int b){
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            return true;
        } else return false;
    }

    private static void positiv (int a){
        if (a >= 0) {
            System.out.println("Число " + a + " положительное");
        } else System.out.println("Число " + a + " отрицательное");
    }

    private static boolean negativ (int a){
        if (a < 0) {
            return true;
        } else return false;
    }

    private static void name(String str){
        System.out.println("Привет, " + str + "!");
    }

    private static void yer(int g){
        if ((g >= 400) && ((g % 400) == 0)){
            System.out.println("Год " + g + " высокосный.");
            return;
        } else if ((g >= 4) && ((g % 4) == 0)){
            if ((g >= 100) && ((g % 100) == 0)){
                System.out.println("Год " + g + " не высокосный.");
                return;
            }
            System.out.println("Год " + g + " высокосный.");
            return;
        } else {
            System.out.println("Год " + g + " не высокосный.");
        }
    }
}
