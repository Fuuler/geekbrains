package ru.geekbrains.java2.lesson2;

public class Main {
    private static String[][] array;
    private static String[][] arraylengthIsMoreThan4;
    private static String[][] arraylengthIsLessThan4;
    private static String[][] arrayColumnlengthLessThan4;

    public static void main(String[] args) {
        array = new String[][]{
                {"1 ","2 ","3 ","4 "},
                {"5 ","6 ","7 ","8 "},
                {"9 ","10 ","11 ","12 "},
                {"13 ","14 ","15 ","16"}
        };

        arraylengthIsMoreThan4 = new String[][]{
                {"1 ","2 ","3 ","4 "},
                {"5 ","6 ","7 ","8 "},
                {"9 ","10 ","11 ","12 "},
                {"13 ","14 ","15 ","16"},
                {"13 ","14 ","15 ","16"}
        };

        arraylengthIsLessThan4 = new String[][]{
                {"1 ","2 ","3 ","4 "},
                {"5 ","6 ","7 ","8 "},
                {"9 ","10 ","11 ","12 "}
        };

        arrayColumnlengthLessThan4 = new String[][]{
                {"1 ","2 ","3 ", "4 "},
                {"5 ","6 ","7 ","8 "},
                {"9 ","10 ","11 ","12 "},
                {"13 ","14 ","15 "}
        };

        twoDimensionalStringArray(array);
        twoDimensionalStringArray(arraylengthIsMoreThan4);
        twoDimensionalStringArray(arraylengthIsLessThan4);
        twoDimensionalStringArray(arrayColumnlengthLessThan4);
    }

    private static void twoDimensionalStringArray(String[][] array) throws MyArraySizeException {
        if (array.length != 4) throw new MyArraySizeException("Неверное количество строк");
        for (int i = 0; i < array.length; i++){
            if (array[i].length != 4)
                throw new MyArraySizeException(String.format("Неверное количество столбцов в %d-й" +
                " строке", i));
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}
