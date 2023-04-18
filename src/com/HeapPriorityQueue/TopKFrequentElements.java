package com.HeapPriorityQueue;
//https://leetcode.com/problems/top-k-frequent-elements/
import java.util.*;

public class TopKFrequentElements {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 2, 2, 3};
        int k = 2;
        System.out.println(Arrays.toString(topKFrequent(arr, k)));
    }

    public static int[] topKFrequent(int[] num, int k) {
        int[] ans = new int[k];
        PriorityQueue<pair> pq = new PriorityQueue<pair>(Collections.reverseOrder());
        HashMap<Integer, Integer> map = new HashMap<>();

        //counting the frequency of the elements;
        for (int i : num) map.put(i, map.getOrDefault(i, 0) + 1);

        int key, value;
        //Traversing the HashMap;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            key = entry.getKey();
            value = entry.getValue();
            pq.add(new pair(key, value));
        }
        for (int i = 0; i < k; i++) {
            ans[i] = pq.remove().element;
        }
        return ans;
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
