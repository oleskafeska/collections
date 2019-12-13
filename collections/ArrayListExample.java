package com.cursor.collections;

import java.util.*;

public class ArrayListExample {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("B");

        List<String> asList = Arrays.asList("D", "E");

        list.addAll(asList);

        list.remove("B");

        if (list.contains("A")) {

            int indexOfA = list.indexOf("A");

            // will print A
            System.out.println(list.get(indexOfA));
        }

        int indexOf = list.indexOf("Z");

        if (indexOf != -1) {
            // never came here. Because Z doesn't exist
        }

        System.out.println(list);
    }

    private static void createArrayList() {

        // Ways to create list

        List<String> list = new ArrayList<>();

        List<Integer> integerList = new ArrayList<>(5);

        List<String> singletonList = Collections.singletonList("A");

        List<String> asList = Arrays.asList("A", "B", "C");

        List<String> listOf = List.of("A", "B", "C", "D");
    }


    // How to calculate a bitwise operation

    // 8 4 2 1
    // 0 0 0 0

    // 1 0 1 0  > > 1  =>    0 1 0 1
}
