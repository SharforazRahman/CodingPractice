package com.SlidingWindow;
//https://leetcode.com/problems/maximum-sum-of-distinct-subarrays-with-length-k/description/

import java.util.HashMap;
import java.util.Map;

public class maximumSumOfDistinctSubArraysWithLengthK {
    public static void main(String[] args) {
        int[] arr = {1, 5, 4, 2, 9, 9, 9};
        int k = 3;
        System.out.println(maximumSubArraySum(arr, k));
    }

    public static long maximumSubArraySum(int[] arr, int k) {
        int i = 0, j = 0;
        long max = 0, sum = 0;
        Map<Integer, Integer> map = new HashMap<>();

        while (j < arr.length) {
            map.put(arr[j], map.getOrDefault(arr[j], 0) + 1);
            sum += arr[j];

            if ((j - i + 1) < k) {
                j++;
            } else if ((j - i + 1) == k) {
                if (map.size() == k) max = Math.max(max, sum);
                sum -= arr[i];

                int key = arr[i];
                int freq = map.get(key);
                map.put(key, freq - 1);
                if (map.get(key) == 0) map.remove(arr[i]);
                i++;
                j++;
            }
        }
        return max;
    }
}
