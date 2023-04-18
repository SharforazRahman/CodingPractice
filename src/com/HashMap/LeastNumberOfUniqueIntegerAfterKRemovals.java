package com.HashMap;
//https://leetcode.com/problems/least-number-of-unique-integers-after-k-removals/

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class LeastNumberOfUniqueIntegerAfterKRemovals {
    public static void main(String[] args) {
        int[] arr = {4, 3, 1, 1, 3, 3, 2};
        int k = 3;
        System.out.println(findLeastNumOfUniqueInts(arr, k));
    }

    public static int findLeastNumOfUniqueInts(int[] arr, int k) {
        PriorityQueue<pair> pq = new PriorityQueue<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        int key, value;

        for (int i : arr) map.put(i, map.getOrDefault(i, 0) + 1);

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            key = entry.getKey();
            value = entry.getValue();
            pq.add(new pair(key, value));
        }
        while (k > 0) {
            k = k - pq.remove().freq;
        }

        return k < 0 ? pq.size() + 1 : pq.size();
    }

    public static class pair implements Comparable<pair> {
        int element;
        int freq;

        pair(int element, int freq) {
            this.element = element;
            this.freq = freq;
        }

        @Override
        public int compareTo(pair o) {
            return this.freq - o.freq;
        }
    }
}
