package com.cursor.collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

    public static void main(String[] args) {

        List<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        // start from first => A > go B > go C > print C
        System.out.println(list.get(2));

        System.out.println(list);
    }
}
