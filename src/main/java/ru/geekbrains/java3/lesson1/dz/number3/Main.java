package ru.geekbrains.java3.lesson1.dz.number3;

public class Main {
    public static void main(String[] args) {

        Box<Orange> orangeBox = new Box<>();
        Box<Apple> appleBox = new Box<>();

        for (int i = 0; i < 3; i++) {
            orangeBox.add(new Orange());
        }
        for (int i = 0; i < 4; i++) {
            appleBox.add(new Apple());
        }

        orangeBox.info();
        appleBox.info();

        float orangeWeigth = orangeBox.getWeight();
        float appleWeigth = appleBox.getWeight();

        System.out.println("Вес коробки с апельсинами: " + orangeWeigth);
        System.out.println("Вес коробки с яблоками: " + appleWeigth);

        System.out.println("Сравнить вес orangeBox и appleBox: " + orangeBox.compare(appleBox));

    }
}
