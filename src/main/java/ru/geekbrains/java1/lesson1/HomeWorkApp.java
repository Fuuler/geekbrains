package ru.geekbrains.java1.lesson1;

/**
 * Создал проект
 * Зинченко В.В.
 */
public class HomeWorkApp {
    public static void main(String[] args) {
/**
 2. Создайте метод printThreeWords(),
 который при вызове должен отпечатать в столбец три слова: Orange, Banana, Apple.
 */
        printThreeWords();

 /**
 3. Создайте метод checkSumSign(),
 в теле которого объявите две int переменные a и b,
 и инициализируйте их любыми значениями,
 которыми захотите. Далее метод должен просуммировать эти переменные,
 и если их сумма больше или равна 0,
 то вывести в консоль сообщение “Сумма положительная”,
 в противном случае - “Сумма отрицательная”;
 */

        checkSumSign(1, 2);
        checkSumSign(-1, 2);
        checkSumSign(0, 2);
        checkSumSign(1, -2);
        checkSumSign(1, 0);
/**
 4. Создайте метод printColor() в теле которого
 задайте int переменную value и инициализируйте ее любым значением.
 Если value меньше 0 (0 включительно), то в консоль метод должен
 вывести сообщение “Красный”, если лежит в пределах
 от 0 (0 исключительно) до 100 (100 включительно), то “Желтый”,
 если больше 100 (100 исключительно) - “Зеленый”;
 */
        printColor(-1);
        printColor(0);
        printColor(1);
        printColor(100);
        printColor(101);
/**
 5. Создайте метод compareNumbers(),
 в теле которого объявите две int переменные a и b,
 и инициализируйте их любыми значениями, которыми захотите.
 Если a больше или равно b, то необходимо вывести в консоль сообщение “a >= b”,
 в противном случае “a < b”;
 */
        compareNumbers(2, 1);
        compareNumbers(1, 1);
        compareNumbers(1, 2);

    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");


    }

    public static void checkSumSign(int a, int b) {
        int c = a + b;
        if (a >= 0 && b >= 0) {
            System.out.println("Сумма положительная = " + c);
        } else {
            System.out.println("Сумма отрицательная = " + c);
        }
    }

    public static void printColor(int value) {
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers(int a, int b) {
        if (a >= b) {
            System.out.println("a>=b");
        } else {
            System.out.println("a<b");
        }
    }

}
