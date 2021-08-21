package ru.geekbrains.lesson4;

import java.util.Scanner;

public class HomeWorkApp {
    //создание игрового поля
    public static char[][] map;
    public static final int SIZE = 3;
    public static final int DOTS_TO_WIN = 3;
    //ячейки поля
    public static final char DOT_EMPTY = '*';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';

    public static void main(String[] args) {
        initMap();
        printMap();
    }
//инициализация поля
    public static void initMap() {
        map = new char[SIZE][DOTS_TO_WIN];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    //вывод поля в консоль
    public static void printMap(){
        for(int i = 0; i <= SIZE; i++){
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++){
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++){
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    //ход человека
    public static Scanner sc = new Scanner(System.in);
    public static void humanTurn(){
        int x,y;
        do{
            System.out.println("Введите координаты в формате X Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(x, y));
        map[y][x] = DOT_X;
    }

    //проверка ячеек
    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false;
        if (map[y][x] == DOT_EMPTY) return true;
        return false;
    }

    }
