package ru.geekbrains.algorithms.lesson8;

public class Main {
    public static void main(String[] args) {
        ChainingHashMap<Integer ,String> map = new ChainingHashMap<>();
        map.put(5,"five");
        map.put(6,"six");
        map.put(15,"15");
        map.put(17,"17");

        System.out.println(map);
        System.out.println("map.get(6): " + map.get(6));
        System.out.println("map.delete(5): " + map.delete(5));
        System.out.println("map.delete(5) again: " + map.delete(5));
        System.out.println(map);
    }
}
