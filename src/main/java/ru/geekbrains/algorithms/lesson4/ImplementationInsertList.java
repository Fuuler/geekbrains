package ru.geekbrains.algorithms.lesson4;

import java.util.*;

import static java.util.Arrays.asList;

public class ImplementationInsertList {

    public static void main(String[] args) {
        ListInsert listInsert = new ListInsert();

        List<Integer> count = asList(1,2,3,4,5,6);
        System.out.println(listInsert.insert(count));
    }

    public static class ListInsert {
        private List queue;
        private int maxSize; // максимальное количество элементов в очереди
        private int nElem;  // текущее количество элементов в очереди
        private int rear;


        public List insert(List elem) {
            if (rear == maxSize - 1) {  // циклический перенос
                rear = -1;
            }

            queue = asList(elem);  // вставка
            nElem++;  // увеличение количества элементов в очереди

            return queue;
        }
    }
}
