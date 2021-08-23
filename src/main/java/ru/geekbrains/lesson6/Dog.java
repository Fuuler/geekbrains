package ru.geekbrains.lesson6;

public class Dog extends Animals {

    public Dog(String name) {
        super(name);
    }

    @Override
    protected void run(String name, int distance) {
        if (distance <= 0) {
            System.out.println(name + " ни чего не пробежал");
        } else if (distance <= 500) {
            System.out.println(name + " пробежал: " + distance + "м");
        } else {
            System.out.println("очень большое расстояние, " + name + " прилег отдохнуть");
        }
    }

    @Override
    public void swim(String name, int distance) {
        if (distance > 10) {
            System.out.println(name + " может проплыть только 10 м");
        } else if (distance <= 0) {
            System.out.println(name + " ни чего не проплыл");
        } else {
            System.out.println(name + " проплыл: " + distance + "м");
        }
    }


}
