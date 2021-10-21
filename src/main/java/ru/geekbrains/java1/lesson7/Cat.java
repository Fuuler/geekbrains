package ru.geekbrains.java1.lesson7;

public class Cat {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public Plate eat(Plate plate) {
        return plate;
    }

    public String getName() {
        return name;
    }
}
