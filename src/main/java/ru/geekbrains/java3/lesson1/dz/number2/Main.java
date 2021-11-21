package ru.geekbrains.java3.lesson1.dz.number2;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        String[] arr = {"abc", "dfs", "clone", "587"};

        List<String> list = convertToList(arr);
        System.out.println("result convertToList \n" + list.getClass() + " : " + list);
    }

    private static <E> List<E> convertToList(E[] array) {
        return Arrays.asList(array);
    }
}
