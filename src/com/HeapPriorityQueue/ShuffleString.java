package com.HeapPriorityQueue;

import org.jetbrains.annotations.NotNull;

import java.util.PriorityQueue;

public class ShuffleString {
    public static void main(String[] args) {
        String s = "codeleet";
        int[] indices = {4, 5, 6, 7, 0, 2, 1, 3};
        System.out.println(restoreString(s, indices));

    }

    public static String restoreString(String s, int[] indices) {
        PriorityQueue<pair> pq = new PriorityQueue<pair>();
        StringBuilder sb = new StringBuilder();
        int idx = 0;

        for(char i : s.toCharArray()) pq.add(new pair(i,indices[idx++]));
        while (!pq.isEmpty()) sb.append(pq.remove().val);
        return sb.toString();
    }

    public static class pair implements Comparable<pair> {
        char val = ' ';
        int idx = 0;

        pair(char val, int idx) {
            this.val = val;
            this.idx = idx;
        }

        /**
         * @param o the object to be compared.
         * @return
         */
        @Override
        public int compareTo(@NotNull pair o) {
            return this.idx - o.idx;
        }
    }
}
