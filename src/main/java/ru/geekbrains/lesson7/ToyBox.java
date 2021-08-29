package ru.geekbrains.lesson7;

public class ToyBox {
    private Toy toy;
    private boolean opened;

    public ToyBox() {
        this.opened = true;
    }

    public void open() {
        if(!opened) {
            opened = true;
            System.out.println("Мы открыли коробку!");
            return;
        }
        System.out.println("Коробка уже открыта!");
    }

    public void close() {
        if(opened) {
            opened = false;
            System.out.println("Мы закрыли коробку!");
            return;
        }
        System.out.println("Коробка уже закрыта!");
    }

    public void putToy(Toy toy) {
        if(!opened) {
            System.out.println("Нельзя положить в закрытую коробку!");
            return;
        }
        if(this.toy != null) {
            System.out.println("Коробка занята!");
            return;
        }

        this.toy = toy;
        System.out.println("В коробку положили игрушку: " + this.toy.getName());
    }

    public Toy extractToy() {
        if(!opened) {
            System.out.println("Нельзя достать игрушку из закрытой коробки!");
            return null;
        }
        if(this.toy == null) {
            System.out.println("В коробке нет игрушки!");
            return null;
        }

        System.out.println("Из коробки достали игрушку: " + this.toy.getName());

        Toy result = this.toy;
        this.toy = null;

        return result;
    }

}
