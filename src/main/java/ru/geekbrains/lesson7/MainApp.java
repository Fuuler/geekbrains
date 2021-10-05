package ru.geekbrains.lesson7;


public class MainApp {
    public static void main(String[] args) {
        Cat[] cats = new Cat[5];
        cats[0] = new Cat("Barsik");
        cats[1] = new Cat("Mursik");
        cats[2] = new Cat("Chernish");
        cats[3] = new Cat("Doshirak");
        cats[4] = new Cat("Mivina");

        for (int i = 0; i < cats.length; ++i) {
            cats[i].getName();
            Plate plate = new Plate(20, 20, cats[i].getName());
            for (Cat cat : cats) {
                cat.eat(plate);
            }
        }
        System.out.println();
        Plate plate1 = new Plate(10, 10, cats[0].getName());
        cats[0].eat(plate1);

        System.out.println();
        Plate plate2 = new Plate(0, 0, cats[1].getName());
        cats[1].eat(plate2);

        System.out.println();
        Plate plate3 = new Plate(19, 9, cats[2].getName());
        cats[2].eat(plate3);

        System.out.println();
        Plate plate4 = new Plate(10, 11, cats[3].getName());
        cats[3].eat(plate4);
    }
}
