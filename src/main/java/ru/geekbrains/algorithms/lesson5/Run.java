package ru.geekbrains.algorithms.lesson5;

import java.util.ArrayList;
import java.util.List;

import static ru.geekbrains.algorithms.lesson5.Backpack.*;

public class Run {

    public static void main(String[] args) {
        //    1. Написать программу по возведению числа в степень с помощью рекурсии.
        System.out.println(raisingNumberPower(2, 3)); // 8

        //    2. Написать программу «Задача о рюкзаке» с помощью рекурсии.

            System.out.println(findBestRes(goods.length - 1, MAX_WEIGHT));
        }



    public static long raisingNumberPower(final int num, final int exp) {
        if (exp == 0) {
            return 1;
        }
        if (exp == 1) {
            return num;
        }
        return num * raisingNumberPower(num, exp - 1);
    }

}
