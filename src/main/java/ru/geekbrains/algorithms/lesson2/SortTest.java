package ru.geekbrains.algorithms.lesson2;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SortTest {
    private static final int NOTEBOOKS_COUNT = 100;

    public static void main(String[] args) {
        List<Notebook> notebooks = generateListNotebooks();

        long timeStart = System.currentTimeMillis();
        notebooks = SortNotebookSelection.sort(notebooks);

        long timeEnd = System.currentTimeMillis();

        displayNoteBooks(notebooks);
        System.out.printf("Прошло времени: %dms", timeEnd - timeStart);
    }

    private static void displayNoteBooks(List<Notebook> list) {
        for (Notebook n : list) {
            System.out.printf("Ноутбук:\tS\\N: %s, \tцена: %s, \tпамять: %s, \tпроизводитель: %s%n",
                    n.getSerialId(), n.getPrice(), n.getMemory(), n.getProducer());
        }
    }

    private static ArrayList<Notebook> generateListNotebooks() {
        ArrayList<Notebook> arrayList = new ArrayList<>();
        for (int i = 0; i < NOTEBOOKS_COUNT; i++) {
            arrayList.add(createNotebook());
        }
        return arrayList;
    }

    private static Notebook createNotebook() {
        Random random = new Random();
        BigDecimal price = BigDecimal
                .valueOf(random.nextInt(26) * 100 + 500);
        int memory = (random.nextInt(6) + 1) * 4;
        int producersCount = Producer.values().length;
        Producer producer = Producer.values()[random.nextInt(producersCount)];
        return new Notebook(price, memory, producer);
    }
}
