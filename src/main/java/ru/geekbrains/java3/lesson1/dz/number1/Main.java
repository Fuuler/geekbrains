package ru.geekbrains.java3.lesson1.dz.number1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] arr = {"abc", "dfs", "clone", "587"};
        Integer[] arr2 = {1, 2, 7, 21, -104, 28};

        System.out.println("result String \n" + Arrays.toString(arr));
        swapElements(arr, 2, 3);
        System.out.println(Arrays.toString(arr));

        System.out.println("result Integer \n" + Arrays.toString(arr2));
        swapElements(arr2, 2, 3);
        System.out.println(Arrays.toString(arr2));
    }


    private static <T> void swapElements(T[] array, int index1, int index2) {
        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
