package org.example;

import java.util.Arrays;
import java.util.LinkedList;

//Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> linkedLst = new LinkedList<>();
        for (int i = 0; i < 100; i++) {
            linkedLst.add(i);
        }
        System.out.println("Исходный список");
        System.out.println(linkedLst);
        reverseLinkedList(linkedLst);
        System.out.println("Перевернутый список");
        System.out.println(linkedLst);

    }

    public static void reverseLinkedList(LinkedList<Integer> lst){
        int temp;
        for (int i = 0; i < lst.size(); i++) {
            lst.add(i, lst.getLast());
            lst.removeLast();
        }
    }
}