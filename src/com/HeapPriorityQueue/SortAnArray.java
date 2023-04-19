package com.HeapPriorityQueue;
//https://leetcode.com/problems/sort-an-array/

import java.util.Arrays;
import java.util.PriorityQueue;


public class SortAnArray {
    public static void main(String[] args) {
        int[] arr = {0, 0, 1, 1, 2, 5};
        System.out.println(Arrays.toString(sortArray(arr)));
    }

    public static int[] sortArray(int[] arr) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i : arr) pq.add(i);
        int idx = 0;
        while (!pq.isEmpty()) arr[idx++] = pq.remove();
        return arr;
    }
}
