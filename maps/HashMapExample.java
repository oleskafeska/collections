package com.cursor.maps;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

    public static void main(String[] args) {

        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("John", 18);
        hashMap.put("Bob", 34);
        hashMap.put("Alice", 24);
        // this is actually not a collision. Value will be replaced by new one by the key
        hashMap.put("John", 45);

        System.out.println(hashMap.entrySet());
    }

    private static void collisions() {

        Map<String, Integer> hashMapWithCollision = new HashMap<>();
        hashMapWithCollision.put("Abcdef", 12);
        hashMapWithCollision.put("AbcdfG", 45);

        // will have the same hash value
        System.out.println("Abcdef".hashCode());
        System.out.println("AbcdfG".hashCode());

        System.out.println(calculateIndexOfBucket("Abcdef"));
        System.out.println(calculateIndexOfBucket("AbcdfG"));
    }

    // formula to calculate bucket's index
    private static int calculateIndexOfBucket(String value) {

        // by default there are 16 buckets in hashMap
        int numberOfBuckets = 16;

        return value.hashCode() & (numberOfBuckets - 1);
    }
}
