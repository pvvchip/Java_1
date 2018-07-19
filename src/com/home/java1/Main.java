package com.home.java1;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


//        1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
//              С помощью цикла и условия заменить 0 на 1, 1 на 0;
        int[] ZeroOne = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for(int i = 0; i < ZeroOne.length; i++){
            ZeroOne[i] = (ZeroOne[i] == 0) ? 1 : 0;
        }

//        2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
        int[] m = new int[8];
        for (int i = 1; i < m.length; i++){
            m[i] = m[i - 1] + 3;
        }

//        3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
        int[] n = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for(int i = 0; i < n.length; i++) if (n[i] < 6)  n[i] =n[i] * 2;

//        4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
//              и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
        int[][] q = new int[8][8];
        for(int i = 0; i < q.length; i++){
            q[i][i] = 1;
        }

//        5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
        int[] MinMax = {12, 45, 57, 99, 234, 2, 783};
        int min = MinMax[0];
        int max = MinMax[0];
        for (int i = 1; i < MinMax.length; i++){
            if (MinMax[i] < min) min = MinMax[i];
            if (MinMax[i] > max) max = MinMax[i];
        }

        int[] mas = {1, 1, 1, 2, 1, 2, 2, 2};
        System.out.println("mas=" + Arrays.toString(mas));
        System.out.println("checkBalance: " + checkBalance(mas));

        int st = 2;
        System.out.println("shift " + st + ": " + Arrays.toString(shift(mas, st)));
    }

//    6. ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true
//              если в массиве есть место, в котором сумма левой и правой части массива равны.
//              Примеры:    checkBalance([1, 1, 1, || 2, 1]) → true,
//                          checkBalance ([2, 1, 1, 2, 1]) → false,
//                          checkBalance ([10, || 10]) → true,
//              граница показана символами ||, эти символы в массив не входят.
    private static boolean checkBalance(int[] i) {
        int leftSum = 0;
        int leftI = 0;
        int rightSum = 0;
        int rightI = i.length - 1;

        while (leftI <= rightI){
            if (leftSum <= rightSum){
              leftSum += i[leftI];
              leftI++;
            } else {
                rightSum += i[rightI];
                rightI--;
            }
        }
        return (leftSum == rightSum);
    }

//     7. **** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным,
//          или отрицательным), при этом метод должен сместить все элементымассива на n позиций.
//          Для усложнения задачи нельзя пользоваться вспомогательными массивами.
    private static int[] shift(int[] mas, int st){

        // в разработке

        return mas;
    }

}
