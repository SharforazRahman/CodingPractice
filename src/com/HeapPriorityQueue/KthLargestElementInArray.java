package com.HeapPriorityQueue;
//https://leetcode.com/problems/kth-largest-element-in-an-array/

import java.util.PriorityQueue;

public class KthLargestElementInArray {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 5, 6, 4};
        int k = 2;
        System.out.println(findKLargest(arr, k));
    }

    public static int findKLargest(int[] arr, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {
            if (i < k) {
                pq.add(arr[i]);
            } else {
                if (arr[i] > pq.peek()) {
                    pq.remove();
                    pq.add(arr[i]);
                }
            }
        }
        return pq.remove();
    }
}
