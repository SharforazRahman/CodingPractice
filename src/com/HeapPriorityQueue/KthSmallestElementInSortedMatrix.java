package com.HeapPriorityQueue;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class KthSmallestElementInSortedMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 5, 9},
                {10, 11, 13},
                {12, 13, 15}
        };
        int k = 8;
        System.out.println(kthSmallest(matrix, k));
    }

    public static int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int[] arr = Stream.of(matrix).flatMapToInt(IntStream::of).toArray();

        for (int i = 0; i < arr.length; i++) {
            if (i < k) {
                pq.add(arr[i]);
            } else {
                if (!pq.isEmpty() && arr[i] < pq.peek()) {
                    pq.remove();
                    pq.add(arr[i]);
                }
            }
        }
        return pq.remove();
    }
}
