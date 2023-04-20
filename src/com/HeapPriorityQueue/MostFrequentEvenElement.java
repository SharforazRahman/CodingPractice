package com.HeapPriorityQueue;
//https://leetcode.com/problems/most-frequent-even-element/
import org.jetbrains.annotations.NotNull;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class MostFrequentEvenElement {
    public static void main(String[] args) {
        int[] arr = {29, 47, 21, 41, 13, 37, 25, 7};
        System.out.println(mostFrequentEven(arr));
    }

    public static int mostFrequentEven(int[] a) {
        PriorityQueue<pair> pq = new PriorityQueue<>(Collections.reverseOrder());
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i : a) {
            if (i % 2 == 0) map.put(i, map.getOrDefault(i, 0) + 1);
        }

        if (map.isEmpty()) return -1;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            pq.add(new pair(entry.getKey(), entry.getValue()));
        }
        return pq.remove().element;
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
