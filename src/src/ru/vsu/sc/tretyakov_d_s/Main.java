package ru.vsu.sc.tretyakov_d_s;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) { // Мэин чисто для проверки наших методов из класса ListCase


        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        list1.add(1); // Наверное кривой способ создания листа,
        list1.add(3); // но сделал на быструю руку, чтобы проверить методы из ListCase.
        list1.add(5); // Всё же в задании было указано лишь о создании класса ListCasе.
        list1.add(7);
        list1.add(8);

        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(7);
        list2.add(9);

        ListCase<Integer> listCase = new ListCase<>(list1, list2);
        System.out.println(listCase.createAListOfRepeatingElementsInTwoLists());
        System.out.println(listCase.createAListOfElementsFromTheFirstListOnly());
        System.out.println(listCase.createAListOfElementsFromTheSecondListOnly());
    }
}
