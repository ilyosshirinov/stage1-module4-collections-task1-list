package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListCreator {
    public LinkedList<Integer> createLinkedList(List<Integer> sourceList) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = sourceList.size() - 1; i >= 0; i--) {
            if (sourceList.get(i) % 2 != 0) {
                list.add(sourceList.get(i));
            }
        }
        for (int i = 0; i < sourceList.size(); i++) {
            if (sourceList.get(i) % 2 == 0) {
                list.add(sourceList.get(i));
            }
        }

        return list;
    }

    public static void main(String[] args) {
        LinkedListCreator linkedListCreator = new LinkedListCreator();
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(14);
        list.add(12);
        list.add(26);
        list.add(24);
        System.out.println(linkedListCreator.createLinkedList(list));
    }
}
