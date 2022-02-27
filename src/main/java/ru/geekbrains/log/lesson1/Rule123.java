package ru.geekbrains.log.lesson1;

public class Rule123 {

    public static int findMax(int[] array) {

        int max = array[0]; //0(1)

        System.out.println("Начинаем поиск"); //0(1)

        for (int i = 1; i < array.length; i++) {
            if (max < array[i]){
                max = array[i];
            }
        } //0(1 + 4 * (n - 1))

        System.out.println("Поиск окончен. Максимальное число: " + max); //0(1)

        return max; //0(1)
    }
}

// 0(1) + 0(1) +  0(1) + 0(1) + 0(4n - 3)
// 0(4n - 3)
// 0(4n)
// 0(n)