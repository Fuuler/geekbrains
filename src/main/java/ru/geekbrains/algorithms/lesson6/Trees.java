package ru.geekbrains.algorithms.lesson6;

import java.security.SecureRandom;
import java.util.LinkedList;
import java.util.List;

public class Trees {
    /**
     * **** Создать и запустить программу для построения двоичного дерева.
     * В цикле построить двадцать деревьев с глубиной в 4 уровня.
     * Данные, которыми необходимо заполнить узлы деревьев,
     * представляются в виде чисел типа int.
     * Число, которое попадает в узел,
     * должно генерироваться случайным образом в диапазоне от -25 до 25.
     * <p>
     * **** Проанализировать, какой процент созданных деревьев является
     * несбалансированными.
     */
    public static void main(String[] args) {
        List<Tree> treeList = new LinkedList<>();
        SecureRandom random = new SecureRandom();
        for (int i = 0; i < 20; i++) {
            Tree tree = new Tree();
            for (int j = 0; j < 4; j++) {
                tree.insert(25 - random.nextInt(185));
            }
            treeList.add(tree);
        }

        int count = 0;
        for (int i = 0; i < treeList.size(); i++) {
            count += treeList.get(i).balance() ? 1 : 0;
        }

        System.out.println(String.format("%s %d", "Total trees count:", treeList.size()));
        System.out.println(String.format("%s %d%s", "Balanced:", count * 100 / treeList.size(), "%"));
    }
}
