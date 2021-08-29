package ru.geekbrains.lesson7;

public class Plate {

    public Plate(int food, int eat, String cat) {
        if (addFood(food) <= 0 && eat <= 0){
            System.out.println("прости, " + cat + ", но хозяин еду в тарелку не положил");
            return;
        }
        if (addFood(food) < eat){
            System.out.println(cat + " не может съесть больше еды чем есть в тарелке");
            return;
        }
        if (addFood(food) >= 20 && eat >= 20){
            System.out.println(cat + " is not hungry");
            return;
        }
        if (addFood(food) < 20 || eat < 20){
            System.out.println(cat + " is hungry");
            return;
        }
    }

    public int addFood(int food){
        return food;
    }

}
