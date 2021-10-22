package ru.geekbrains.java2.lesson2;

import java.util.Arrays;

public class Main {
    private static String[][] array;
    private static String[][] arraylengthIsMoreThan4;
    private static String[][] arraylengthIsLessThan4;
    private static String[][] arrayColumnlengthLessThan4;
    private static String[][] arrayColumnSymbol;

    public static void main(String[] args) {
        array = new String[][]{
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"}
        };

        arraylengthIsMoreThan4 = new String[][]{
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"}
        };

        arraylengthIsLessThan4 = new String[][]{
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"}
        };

        arrayColumnlengthLessThan4 = new String[][]{
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1"}
        };

        arrayColumnSymbol = new String[][]{
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "a"}
        };


        try {
            int sum = getArray(array);
            System.out.println("сумма массива = " + sum); // сумма массива = 16

//            int sum2 = getArray(arraylengthIsMoreThan4);
//            System.out.println("сумма массива = " + sum2); // MyArraySizeException: Неверное количество строк, не может быть больше или меньше 4x4

//            int sum3 = getArray(arraylengthIsLessThan4);
//            System.out.println("сумма массива = " + sum3); // MyArraySizeException: Неверное количество строк, не может быть больше или меньше 4x4

//            int sum4 = getArray(arrayColumnlengthLessThan4);
//            System.out.println("сумма массива = " + sum4); // MyArraySizeException: Неверное количество столбцов в строке = 3

//            int sum5 = getArray(arrayColumnSymbol);
//            System.out.println("сумма массива = " + sum5); // MyArrayDataException: нельзя преобразовать ячейку 3x3
        } catch (MyArraySizeException | MyArrayDataException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }


    static int getArray(String[][] arr) throws MyArraySizeException, MyArrayDataException{
        int sum = 0;
        if (arr.length != 4) throw new MyArraySizeException("Неверное количество строк, не может быть больше или меньше 4x4");
         for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4){
                throw new MyArraySizeException("Неверное количество столбцов в строке = " + i);
            }
            for (int j = 0; j < arr[i].length ; j++) {
                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Нельзя преобразовать ячейку " + i + "x" + j);
                }
            }
        }

        Integer[][] intArray = new Integer[arr.length][arr[0].length];
        int res = 0;
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[0].length ; j++) {
                intArray[i][j] = Integer.parseInt(arr[i][j]);
                res += intArray[i][j];
            }
        }
        return sum;
    }
}
