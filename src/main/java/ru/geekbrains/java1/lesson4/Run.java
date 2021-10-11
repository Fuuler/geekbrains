package ru.geekbrains.java1.lesson4;

public class Run {
    public static void main(String[] args) {

        boolean debug = false;

        if (debug) {
            testCheckCircleWin(testMap5x5,5,4);
        } else {
            new TicTacToe();
        }

    }

    public static int SIZE = 3;
    public static char[][] map = null;
    public static char[][][] testMap = {
            {{'x', 'x', 'x'}, {'.', '.', '.'}, {'.', '.', '.'}},
            {{'.', '.', '.'}, {'x', 'x', 'x'}, {'.', '.', '.'}},
            {{'.', '.', '.'}, {'.', '.', '.'}, {'x', 'x', 'x'}},

            {{'x', '.', '.'}, {'x', '.', '.'}, {'x', '.', '.'}},
            {{'.', 'x', '.'}, {'.', 'x', '.'}, {'.', 'x', '.'}},
            {{'.', '.', 'x'}, {'.', '.', 'x'}, {'.', '.', 'x'}},

            {{'x', '.', '.'}, {'.', 'x', '.'}, {'.', '.', 'x'}},
            {{'.', '.', 'x'}, {'.', 'x', '.'}, {'x', '.', '.'}},
            {{'x', 'x', '.'}, {'.', 'x', '.'}, {'x', '.', 'x'}},

            // false
            {{'x', 'x', '.'}, {'.', 'x', '.'}, {'x', '.', '.'}},
            {{'.', '.', 'x'}, {'.', '.', '.'}, {'.', '.', 'x'}}
    };

    public static char[][][] testMap5x5 = {
            {{'x', 'x', 'x', 'x', '.'},
                    {'.', '.', '.', '.', '.'},
                    {'.', '.', '.', '.', '.'},
                    {'.', '.', '.', '.', '.'},
                    {'.', '.', '.', '.', '.'}},

            {{'.', '.', '.', '.', '.'},
                    {'.', 'x', 'x', 'x', 'x'},
                    {'.', 'x', '.', '.', '.'},
                    {'.', 'x', '.', '.', '.'},
                    {'x', '.', 'x', '.', '.'}},

            {{'x', '.', '.', '.', 'x'},
                    {'x', '.', '.', 'x', '.'},
                    {'x', '.', 'x', '.', '.'},
                    {'.', 'x', '.', '.', '.'},
                    {'.', '.', 'x', '.', '.'}},

            {{'.', '.', '.', '.', 'x'},
                    {'.', '.', '.', '.', '.'},
                    {'.', '.', '.', '.', '.'},
                    {'.', '.', '.', '.', 'x'},
                    {'.', '.', '.', '.', 'x'}},

            {{'.', '.', '.', '.', '.'},
                    {'x', 'x', 'x', '.', '.'},
                    {'.', '.', '.', '.', '.'},
                    {'.', '.', '.', '.', '.'},
                    {'.', '.', '.', '.', '.'}}
    };

    public static boolean checkCircleWin(char dot, int size, int whenWon) {

        int sumDiagB, sumDiagS;
        sumDiagB = sumDiagS = 0;

        for (int diag = 0; diag < size; diag++) {

            int sumRow, sumCol;
            sumRow = sumCol = 0;

            for (int i = 0; i < size; i++) {
                sumRow += (map[diag][i] == dot) ? 1 : -1;
                sumCol += (map[i][diag] == dot) ? 1 : -1;
                if (i == diag) {
                    sumDiagB += (map[diag][diag] == dot) ? 1 : -1;
                    sumDiagS += (map[diag][size - 1 - diag] == dot) ? 1 : -1;
                }
                if (sumRow >= whenWon || sumCol >= whenWon) return true;
                if (sumRow < 0) sumRow = 0;
                if (sumCol < 0) sumCol = 0;
            }

            if (sumDiagB >= whenWon || sumDiagS >= whenWon) return true;
            if (sumDiagB < 0) sumDiagB = 0;
            if (sumDiagS < 0) sumDiagS = 0;
        }

        return false;
    }

    public static void testCheckCircleWin(Object[] data, int size, int whenWon) {
        for (int i = 0; i < data.length; i++) {
            map = (char[][]) data[i];
            if (checkCircleWin('x', size, whenWon)) {
                System.out.println("check is [true]");
            } else {
                System.out.println("check is [false]");
            }

        }
        System.out.println();
    }
}
