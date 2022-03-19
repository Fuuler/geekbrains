package ru.geekbrains.algorithms.lesson5;

public class Backpack {
    static final int MAX_WEIGHT = 81;

    static Goods[] goods = {
            new Goods(16, 31),
            new Goods(31, 90),
            new Goods(51, 101)
    };

    protected static int findBestRes(int i, int weigth) {
        if (i < 0) {
            return 0;
        }
        if (goods[i].getWeight() > weigth) {
            return findBestRes(i-1, weigth);
        }
        else {
            return Math.max(findBestRes(i-1, weigth),
                    findBestRes(i-1, weigth - goods[i].getWeight()) + goods[i].getValue()); // ???
        }
    }
}
