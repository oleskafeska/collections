package com.cursor.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample  {

    public static void main(String[] args) {

        Set<String> hashSet = new HashSet<>();
        hashSet.add("A");
        hashSet.add("B");
        // will replace previous value 'A' because of duplicate ( by hash value - A.hashcode())
        hashSet.add("A");
        // work's fine
        hashSet.add(null);

        System.out.println(hashSet);

        Set<String> treeSet = new TreeSet<>();
        treeSet.add("C");
        treeSet.add("B");
        treeSet.add("A");
        // will replace previous value 'A' because of duplicate A.equals(A)
        treeSet.add("A");
        // won't work. See documentation
        //treeSet.add(null);

        System.out.println(treeSet);

        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("C");
        linkedHashSet.add("S");
        linkedHashSet.add("I");
        // works fine
        linkedHashSet.add(null);

        System.out.println(linkedHashSet);
    }
}
