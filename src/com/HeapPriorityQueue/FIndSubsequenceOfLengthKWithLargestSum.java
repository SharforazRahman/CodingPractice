package com.HeapPriorityQueue;
//https://leetcode.com/problems/find-subsequence-of-length-k-with-the-largest-sum/

import java.util.*;

public class FIndSubsequenceOfLengthKWithLargestSum {
    public static void main(String[] args) {
        int[] arr = {50, -78};
        int k = 2;
        System.out.println(Arrays.toString(maxSubsequence(arr, k)));
    }

    public static int[] maxSubsequence(int[] arr, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.comparingInt(o -> arr[o]));
        for (int i = 0; i < arr.length; i++) {
            if (pq.size() < k) {
                pq.add(i);
            } else if (!pq.isEmpty() && arr[pq.peek()] < arr[i]) {
                pq.poll();
                pq.add(i);
            }
        }
        int[] res = new int[k];
        Set<Integer> set = new HashSet<>(pq);
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (set.contains(i)) {
                res[j++] = arr[i];
            }
        }
        return res;
    }
}

