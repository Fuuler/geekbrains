package ru.geekbrains.java2.lesson8;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApp {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add(random.nextInt(100)); // 0-99
        }
//        System.out.println(list);


//        long count = list.stream()
//                .limit(50)
////                .skip(50)
//                .peek(i -> System.out.println()) // не терминальный
//                .filter(Integer -> Integer % 2 == 1)
//                .count();
////                .min(Comparator.naturalOrder()).get();
//        System.out.println(count);

//        List<Integer> list2 = list.stream()
//                .limit(50)
//                .filter(Integer -> Integer % 2 == 1)
//                .collect(Collectors.toList());
//        System.out.println(list2);

//        list = list.stream()
//                .limit(50)
//                .filter(Integer -> Integer % 2 == 1)
//                .map(integer -> integer * 1000)
//                .collect(Collectors.toList());
//        System.out.println(list);

//        String s = list.stream()
//                .limit(50)
//                .filter(Integer -> Integer % 2 == 1)
//                .map(integer -> integer * 1000)
//                .map(integer -> String.valueOf(integer))
//                .collect(Collectors.joining("-")); //помогает конкатенировать строку
//        System.out.println(s);

//        String s = list.stream()
//                .limit(50)
//                .filter(Integer -> Integer % 2 == 1)
//                .sorted() // сортировка по asc
//                .distinct() // только уникальные элементы
//                .map(integer -> integer * 1000)
//                .map(integer -> String.valueOf(integer))
//                .collect(Collectors.joining("-")); //помогает конкатенировать строку
//        System.out.println(s);

        Stream<String> stringStream = Stream.of("aaaa", "bbbb", "aaa", "cccc", "aaaa", "bbb");

        List<String> collect = stringStream.filter(str -> str.length() == 4)
                .map(str -> str.toUpperCase())
                .collect(Collectors.toList());
        System.out.println(collect);
    }
}

