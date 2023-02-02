package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCreator {
    public ArrayList<String> createArrayList(List<String> sourceList) {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 2; i < sourceList.size(); i+=3) {
            list.add(sourceList.get(i));
            list.add(sourceList.get(i));
        }
        return list;
    }

//    public static void main(String[] args) {
//        ArrayListCreator arrayListCreator = new ArrayListCreator();
//        List<String> list = new ArrayList<>();
//        list.add("The");
//        list.add("ArrayList");
//        list.add("class");
//        list.add("has");
//        list.add("many");
//        list.add("useful");
//        list.add("methods");
//        System.out.println(arrayListCreator.createArrayList(list));
//    }
}
