package ru.geekbrains.lesson3;

import java.util.Arrays;

public class HomeWorkApp {
    public static void main(String[] args) {
        /**
         * 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
         * Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
         * С помощью цикла и условия заменить 0 на 1, 1 на 0;
         */
        System.out.println("1 задание");
//        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
//        replacementInArray(arr);

        /**
         * 2. Задать пустой целочисленный массив длиной 100.
         * С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
         */
        System.out.println("2 задание");
//        fillArray();

        /**
         * 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
         * пройти по нему циклом, и числа меньше 6 умножить на 2;
         */
        System.out.println("3 задание");
//        arrayCycleValue();

        /**
         * 4. Создать квадратный двумерный целочисленный массив
         * (количество строк и столбцов одинаковое),
         * и с помощью цикла(-ов) заполнить его диагональные
         * элементы единицами (можно только одну из диагоналей,
         * если обе сложно). Определить элементы одной из диагоналей
         * можно по следующему принципу:
         * индексы таких элементов равны,
         * то есть [0][0], [1][1], [2][2], …, [n][n];
         */
        System.out.println("4 задание");
//        fillDiagonal();

        /**
         * 5. Написать метод, принимающий на вход два аргумента:
         * len и initialValue, и возвращающий одномерный массив типа int
         * длиной len, каждая ячейка которого равна initialValue;
         */
        System.out.println("5 задание");
//        methodsTwoArguments(5, 7);

        /**
         * 6. * Задать одномерный массив и найти в нем минимальный
         * и максимальный элементы;
         */
        System.out.println("6 задание");
//        arrayMaxAndMinValue(1, 2, 6, -4, 4, 5, -2, -5, 2, 3);

        /**
         * 7. ** Написать метод, в который передается не пустой
         * одномерный целочисленный массив, метод должен вернуть true,
         * если в массиве есть место, в котором сумма левой
         * и правой части массива равны.
         */
        System.out.println("7 задание");
//        checkBalance(2, 2, 2, 1, 2, 2, 10, 1);//true
//        checkBalance(1, 1, 1, 2, 1);//true
//        checkBalance(1, 1, 2, 1);//false

        /**
         * 8. *** Написать метод, которому на вход
         * подается одномерный массив и число n
         * (может быть положительным, или отрицательным),
         * при этом метод должен сместить все элементы массива
         * на n позиций. Элементы смещаются циклично.
         * Для усложнения задачи нельзя пользоваться
         * вспомогательными массивами.
         * Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо)
         * -> [ 3, 1, 2 ]; [ 3, 5, 6, 1] при n = -2 (на два влево)
         * -> [ 6, 1, 3, 5 ]. При каком n в какую сторону
         * сдвиг можете выбирать сами.
         */
        System.out.println("8 задание - не смог решить");
    }

    public static void replacementInArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("до замены было " + arr[i]);
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
            System.out.print(" -> после замены стало " + arr[i]);
            System.out.println(" ");
        }
    }

    public static void fillArray() {
        int[] arr = new int[100];
        for (int i = 1; i < arr.length; i++) {
            arr[i] = i;
            System.out.print(arr[i]);
            System.out.print(" ");
        }
        System.out.println("100");
    }

    public static void arrayCycleValue() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                System.out.print("было " + arr[i]);
                arr[i] *= 2;
                System.out.println(" поменяли значение на " + arr[i]);
            } else {
                System.out.println("значение не поменялось " + arr[i]);
            }
        }
    }

    public static void fillDiagonal() {
        int n = 5;
        int[][] arr = new int[n][n];
        for (int i = 0; i < arr.length; i++) {
            System.out.println();
            for (int j = 0; j < arr.length; n = arr[i].length, j++, n--) {
                if (i == j || i == n - j) {
                    arr[i][j] = 1;
                    System.out.print(arr[i][j]);
                } else {
                    System.out.print(arr[i][j]);
                }
            }
        }
    }


    public static int[] methodsTwoArguments(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < array.length; i++) {
            array[i] = initialValue;
            System.out.println(array[i]);
        }
        return array;
    }

    public static void arrayMaxAndMinValue(int... array) {
        int max = array[0];
        int min = array[0];
        for (int i = 0; i != array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println("max value = " + max);
        System.out.println("min value = " + min);
    }

    public static boolean checkBalance(int... array) {
        int leftSum = 0;
        for (int i = 0; i < array.length; i++) {
            leftSum += array[i];
            int rightSum = 0;
            for (int j = 0; j < array.length; j++) {
                rightSum += (j > i) ? array[j] : 0;
            }
            if (leftSum == rightSum) {
                System.out.println("true");
                return true;
            }
        }
        System.out.println("false");
        return true;
    }
}
