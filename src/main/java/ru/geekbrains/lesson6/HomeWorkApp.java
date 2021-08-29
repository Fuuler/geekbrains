package ru.geekbrains.lesson6;

public class HomeWorkApp {
    public static void main(String[] args) {
        Cat cat = new Cat("Мурзик");
        Cat cat2 = new Cat("Мурлык");
        Cat cat3 = new Cat("Черныш");
        Dog dog = new Dog("Бобик");
        Dog dog2 = new Dog("Рекс");
        Dog dog3 = new Dog("Кекс");
        Dog dog4 = new Dog("Кекс");

        /**
         * 4. Добавить подсчет созданных котов, собак и животных.
         */
        Animals.count(cat, cat2, cat3, dog, dog2, dog3, dog4); // не могу вывести просто количество в чем ошибка?

        System.out.println();
        cat.run(cat.name, 200);
        cat2.run(cat.name, 201);
        cat3.run(cat.name, 0);
        dog.run(dog.name,500);
        dog2.run(dog2.name,501);
        dog3.run(dog3.name,0);
        cat.swim(cat.name,100);
        dog.swim(dog.name,10);
        dog2.swim(dog2.name,9);
        dog3.swim(dog3.name,11);
        dog3.swim(dog3.name,0);

      }

}
