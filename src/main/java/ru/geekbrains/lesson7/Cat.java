package ru.geekbrains.lesson7;

public class Cat {
    private String name;
    private int appetite;
    private boolean hungry;

    public Cat(String name) {
        this.name = name;
        this.appetite = 5;
        this.hungry = true;
    }

    public void setHungry(boolean hungry) {
        this.hungry = hungry;
    }

    public int getAppetite() {
        return appetite;
    }

    public void info() {
        System.out.println(name + " " + hungry);
    }

    public void eat(Plate plate) {
        if(plate.getFood() <= 0 && appetite != 0) {
            hungry = true;
            return;
        }
        plate.decreaseFood(appetite);
        hungry = false;
        System.out.println("Кот поел из тарелки!");
    }
}
