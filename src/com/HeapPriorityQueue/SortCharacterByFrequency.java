package com.HeapPriorityQueue;
//https://leetcode.com/problems/sort-characters-by-frequency/

import org.jetbrains.annotations.NotNull;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class SortCharacterByFrequency {
    public static void main(String[] args) {
        String s = "tree";
        System.out.println(frequency(s));
    }

    public static String frequency(String s) {
        PriorityQueue<pair> pq = new PriorityQueue<pair>(Collections.reverseOrder());
        HashMap<Character, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();

        for (char i : s.toCharArray()) map.put(i, map.getOrDefault(i, 0) + 1);

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            pq.add(new pair(entry.getKey(), entry.getValue()));
        }

        while (!pq.isEmpty()) {
            char occurrence = (char) pq.remove().element;
            sb.append(String.valueOf(occurrence).repeat(Math.max(0, map.get(occurrence))));
        }
        return sb.toString();
    }

    public static class pair implements Comparable<pair> {
        int element;
        int freq;

        pair(int element, int freq) {
            this.element = element;
            this.freq = freq;
        }

        /**
         * @param o the object to be compared.
         * @return
         */
        @Override
        public int compareTo(@NotNull pair o) {
            return this.freq - o.freq;
        }
    }
}
