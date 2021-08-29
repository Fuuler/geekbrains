package ru.geekbrains.lesson7;

public class Plate {
    private int food;

    public Plate(int food) {
        if(food <= 0) {
            this.food = food;
        } else {
            System.out.printf("в тарелку не положили еду %d " + this.food);
        }
    }

    public void decreaseFood(int amount) {
        food -= amount;
    }

    public int getFood() {
        return food;
    }

    public void info() {
        System.out.printf("Plate [ Food: %d ]\n", food);
    }
}
