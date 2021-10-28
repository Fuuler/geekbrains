package ru.geekbrains.java2.lesson4;

import ru.geekbrains.java2.lesson2.Main;

import java.util.Arrays;

public class ArrayApp {
    private static final int SIZE = 10000000;
    private static final int NUMBER_THREADS = 4;
    private static final int HALF = SIZE / NUMBER_THREADS;
    private static float[] arr = new float[SIZE];

    public static void main(String[] args) {
    ArrayApp arrayApp = new ArrayApp();
    arrayApp.firstArr();
    arrayApp.secondArr();

    }

    private void secondArr() {
        //создаю массив потоков
        Thread[] threads = new Thread[NUMBER_THREADS];

        //заполняю массив единицами
        Arrays.fill(arr, 1.0f);
        //засекаю время выполнения
        long timeRun = System.currentTimeMillis();

        //разбиваю массив на массивы размером HALF
        float[][] newArr = new float[NUMBER_THREADS][HALF];
        for(int i = 0; i < NUMBER_THREADS; i++){
            System.arraycopy(arr, i * HALF, newArr[i], 0, HALF);
        }

        //засекаю время на разделение массива
        long split = System.currentTimeMillis();
        System.out.println("Время разделения массива " + (split - timeRun));

        //произвожу вычисления в NUMBER_THREADS потоков, запускаю, жду окончания
        for(int i = 0; i < NUMBER_THREADS; i++){
            int finals = i;
            threads[i] = new Thread(() -> calcSeconderArr(newArr, finals));
            threads[i].start();
            try {
                threads[i].join();
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        //засекаю время на сборку
        long concat = System.currentTimeMillis();

        //склеиваю эти массивы обратно в один
        for(int i = 0; i < NUMBER_THREADS; i++){
            System.arraycopy(newArr[i], 0, arr, i * HALF, HALF);
        }
        //проверяю время окончания метода
        long end = System.currentTimeMillis();
        System.out.println("Время склейки массива " + (end - concat));
        System.out.println("Время выполнения второго метода " + (end - timeRun));
    }

    private void calcSeconderArr(float[][] arr, int n) {
        long start = System.currentTimeMillis();
        for(int i = 0; i < HALF; i++) {
            arr[n][i] = (float) (arr[n][i]
                    * Math.sin(0.2f + i/5) * Math.cos(0.2f + i/5)
                    * Math.cos(0.4f + i/2));
        }
        long end = System.currentTimeMillis();
        System.out.println("Время выполнения " + (NUMBER_THREADS + 1)
                + "-го потока " + (end - start));
    }

    private void firstArr() {
        //заполняю этот массив единицами
        Arrays.fill(arr, 1.0f);
        //засекаю время выполнения
        long a = System.currentTimeMillis();

        //прохожу по всему массиву и для каждой ячейки считаю новое значение по формуле
        for(int i = 0; i < SIZE; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i/5) * Math.cos(0.2f + i/5) * Math.cos(0.4 + i/2));
        }
        //проверяю время окончания метода
        long end = System.currentTimeMillis();
        System.out.println("Время выполнения первого метода " + (end - a));
    }
}
