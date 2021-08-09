package ru.geekbrains.lesson1.lesson2;

public class HomeWorkApp {
    public static void main(String[] args) {
        /**
         1. Написать метод, принимающий на вход два целых числа
         и проверяющий, что их сумма лежит
         в пределах от 10 до 20 (включительно),
         если да – вернуть true, в противном случае – false.
         */
        taskPrint(1);
        within10and20(5, 5); //true
        within10and20(5, 6); //true
        within10and20(5, 15); //true
        within10and20(5, 4); //false
        within10and20(5, 16); //false

        /**
         2. Написать метод, которому в качестве параметра
         передается целое число, метод должен напечатать в консоль,
         положительное ли число передали или отрицательное.
         Замечание: ноль считаем положительным числом.
         */
        taskPrint(2);
        isPositiveOrNegative(0);
        isPositiveOrNegative(1);
        isPositiveOrNegative(-1);

        /**
         3. Написать метод, которому в качестве параметра передается
         целое число. Метод должен вернуть true, если число отрицательное,
         и вернуть false если положительное.
         */
        taskPrint(3);
        isNegative(1);
        isNegative(0);
        isNegative(-1);

        /**
         4. Написать метод, которому в качестве аргументов
         передается строка и число, метод должен отпечатать
         в консоль указанную строку, указанное количество раз;
         */
        taskPrint(4);
        printWordNTimes(0, "предупреждение");
        printWordNTimes(-1, "предупреждение");
        printWordNTimes(5, "да будет свет в твоем окне");

        /**
         5. * Написать метод, который определяет,
         является ли год високосным, и возвращает boolean
         (високосный - true, не високосный - false).
         Каждый 4-й год является високосным,
         кроме каждого 100-го, при этом каждый 400-й – високосный.
         */
        taskPrint(5);
        leapYearAndNotLeapYear(1700);
        leapYearAndNotLeapYear(1800);
        leapYearAndNotLeapYear(1900);
        leapYearAndNotLeapYear(1600);
        leapYearAndNotLeapYear(2000);

    }

    public static Boolean within10and20(int a, int b) {
        int c = a + b;
        if (10 <= c && c <= 20) {
            System.out.println(true);
            return true;
        } else {
            System.out.println(false);
            return false;
        }
    }

    public static void isPositiveOrNegative(int a) {
        if (a >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    public static Boolean isNegative(int a) {
        if (a >= 0) {
            System.out.println(false);
            return false;
        } else {
            System.out.println(true);
            return true;
        }
    }

    public static void printWordNTimes(int a, String b) {
        if (a <= 0) {
            System.out.println("число не может быть 0 или иметь отрицательное значение");
            } else {
            for (int i = 0; i < a; i++) {
                System.out.println(b);
            }
        }
    }

    public static void leapYearAndNotLeapYear(int year){
        if((year % 400 == 0) ||
                ((year % 4 == 0) && (year % 100 != 0))){
            System.out.println("високосный = " + true);
        } else {
            System.out.println("не високосный = " + false);
        }
    }

    public static void taskPrint(int a){
        System.out.println();
        System.out.println(a + " задание");
        System.out.println();
    }

  }
