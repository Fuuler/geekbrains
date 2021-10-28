package ru.geekbrains.java2.lesson3;

import java.util.*;

public class Run {
    public static void main(String[] args) {
        List<String> array =
                Arrays.asList("Маша", "Даша", "Рома", "Маша", "Даша","Рома",
                           "Коля", "Лисан", "Рома", "Петя", "Лора");

        Set<String> noDublicate = new LinkedHashSet<>(array);
        System.out.println("список уникальных имен " + noDublicate);

        HashMap<String, Integer> duplicateNames = new HashMap<>();
        Integer duplicateName;
        for (String i : array) {
            duplicateName = duplicateNames.get(i);
            duplicateNames.put(i, duplicateName == null ? 1 : duplicateName + 1);
        }
        System.out.println("сколько раз встречается каждое имя " + duplicateNames);
        }
    }
