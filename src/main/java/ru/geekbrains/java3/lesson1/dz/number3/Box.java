package ru.geekbrains.java3.lesson1.dz.number3;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {

    private List<T> list;

    public List<T> getList() {
        return list;
    }

    public Box() {
        list = new ArrayList<T>();
    }

    protected void add(T obj) {
        list.add(obj);
    }

    protected void info() {
        if (list.isEmpty()) {
            System.out.println("Коробка пуста");
        } else {
            System.out.println("В коробке, количество " + list.get(0).toString() +
                    " = " + list.size());
        }
    }

    protected float getWeight() {
        if (list.isEmpty()) {
            return 0;
        } else {
            return list.size() * list.get(0).getWeight();
        }
    }

    protected boolean compare(Box<? extends Fruit> box) {
        return this.getWeight() == box.getWeight();
    }
}
