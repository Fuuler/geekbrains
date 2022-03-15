package ru.geekbrains.algorithms.lesson4;

import java.util.ArrayDeque;
import java.util.Iterator;

public class ImplementationDeque {

    public static void main(String[] args) {
        ArrayDeque<String> ad = new ArrayDeque<>();
        ad.add("Red");
        ad.add("Blue");
        ad.add("White");
        ad.add("Yellow");
        ad.add("Black");

        System.out.println("Iterate using iterator:");
        Iterator<String> i = ad.iterator();
        while(i.hasNext())
            System.out.println(i.next());

        System.out.println("Iterate descendingIterator:");
        Iterator<String> di = ad.descendingIterator();
        while(di.hasNext())
            System.out.println(di.next());
    }
}

