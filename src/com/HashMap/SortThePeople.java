package com.HashMap;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class SortThePeople {
    public static void main(String[] args) {
        String[] names = {"Mary", "John", "Emma"};
        int[] heights = {180, 165, 170};
        System.out.println(Arrays.toString(sortPeople(names, heights)));
    }

    public static String[] sortPeople(String[] names, int[] heights) {
        PriorityQueue<pair> pq = new PriorityQueue<pair>(Collections.reverseOrder());
        String[] ans = new String[names.length];

        int idx = 0, idx2 = 0;
        for (String i : names) pq.add(new pair(i, heights[idx++]));
        while (!pq.isEmpty()) ans[idx2++] = pq.remove().name;

        return ans;
    }

    public static class pair implements Comparable<pair> {
        String name;
        int height;

        pair(String name, int height) {
            this.name = name;
            this.height = height;
        }

        @Override
        public int compareTo(pair o) {
            return this.height - o.height;
        }
    }
}
