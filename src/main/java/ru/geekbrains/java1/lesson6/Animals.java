package ru.geekbrains.java1.lesson6;

public abstract class Animals {
    protected String name;

    public Animals(String name) {
        this.name = name;
    }

    public Animals() {
    }

    protected void run(String name, int distance) {
        System.out.println(name + " пробежал: " + distance + "м");
    }

    protected void swim(String name, int distance) {
        System.out.println(name + " проплыл: " + distance + "м");
    }

//    protected static void count(Object... obj) {
//        for (int i = 0; i < obj.length; i++) {
//            if (obj[i] instanceof Cat) {
//                Cat[] cats = {(Cat) obj[i]};
//                System.out.println("котов всего " + cats.length);
//            } else if (obj[i] instanceof Dog) {
//                Dog[] dogs = {(Dog) obj[i]};
//                System.out.println("собак всего " + dogs.length);
//            } else {
//                Animals[] animals = {(Animals) obj[i]};
//                System.out.println("животных всего " + animals.length);
//            }
//        }
//    }
}
