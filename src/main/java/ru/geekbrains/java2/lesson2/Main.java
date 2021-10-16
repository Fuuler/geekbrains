package ru.geekbrains.java2.lesson2;

import java.util.Arrays;

public class Main {
    private static String[][] array;
    private static String[][] arraylengthIsMoreThan4;
    private static String[][] arraylengthIsLessThan4;
    private static String[][] arrayColumnlengthLessThan4;

    public static void main(String[] args) {
        array = new String[][]{
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"}
        };
//
//        arraylengthIsMoreThan4 = new String[][]{
//                {"1","2","3","4"},
//                {"5","6","7","8 "},
//                {"9 ","10 ","11 ","12 "},
//                {"13 ","14 ","15 ","16"},
//                {"13 ","14 ","15 ","16"}
//        };
//
//        arraylengthIsLessThan4 = new String[][]{
//                {"1 ","2 ","3 ","4 "},
//                {"5 ","6 ","7 ","8 "},
//                {"9 ","10 ","11 ","12 "}
//        };
//
//        arrayColumnlengthLessThan4 = new String[][]{
//                {"1 ","2 ","3 ", "4 "},
//                {"5 ","6 ","7 ","8 "},
//                {"9 ","10 ","11 ","12 "},
//                {"13 ","14 ","15 "}
//        };

//        String[][] array = new String[4][3];
//        array[0][0] = "ewq";

        try {
            int sum = getArray(array);
            System.out.println("сумма массива = " + sum);
        } catch (MyArraySizeException | MyArrayDataException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }


    static int getArray(String[][] arr) throws MyArraySizeException, MyArrayDataException{
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4){
                throw new MyArraySizeException("Длина массива не может быть больше или меньше 4х4");
            }
            for (int j = 0; j < arr[i].length ; j++) {
                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(" нельзя преобразовать ячейку " + i + "x" + j);
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
