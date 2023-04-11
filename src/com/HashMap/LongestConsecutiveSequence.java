package com.HashMap;

import java.util.HashMap;

//https://leetcode.com/problems/longest-consecutive-sequence/
public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] arr = {0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
        System.out.println(longestConsecutive(arr));
    }

    public static int longestConsecutive(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : arr) map.put(i, 0);

        int length = 1, max = 0;
        for (int i : arr) {
            if (!map.containsKey(i - 1)) {
                int ele = i;
                length = 1;
                while (map.containsKey(ele + 1)) {
                    ele++;
                    length++;
                }
            }
            max = Math.max(max, length);
        }
        return max;
    }
}
