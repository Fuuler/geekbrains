package ru.geekbrains.lesson6;

public class Cat extends Animals{
    public Cat(String name) {
        super(name);
    }
    public Cat() {
        super();
    }

    @Override
    protected void run(String name, int distance) {
        if (distance <= 0) {
            System.out.println(name + " ни чего не пробежал");
        } else if (distance <= 200) {
            System.out.println(name + " пробежал: " + distance + "м");
        } else {
            System.out.println("очень большое расстояние, " + name + " прилег отдохнуть");
        }
    }

    @Override
    public void swim(String name, int distance){
       System.out.println("увы, но коты не умеют плавать, " + name  + " прости.");
    }

}
