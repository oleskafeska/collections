package com.cursor.collections;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {

    public static void main(String[] args) {

        // natural ordering
        Queue<Integer> queue = new PriorityQueue<>();
        queue.add(3);
        queue.add(4);
        queue.add(1);
        queue.add(2);

        System.out.println(queue);

        // remove after print
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }

        System.out.println(queue);

        // insertion ordering
        Queue<String> deque = new ArrayDeque<>();
        deque.add("C");
        deque.add("S");
        deque.add("A");

        while (!deque.isEmpty()) {

            // print and remove
            System.out.println(deque.poll());
        }

        // here deque is empty
        System.out.println(queue);
    }
}
