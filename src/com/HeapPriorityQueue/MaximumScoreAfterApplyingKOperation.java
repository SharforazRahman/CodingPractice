package com.HeapPriorityQueue;

import java.util.Collections;
import java.util.PriorityQueue;

public class MaximumScoreAfterApplyingKOperation {
    public static void main(String[] args) {
        int[] arr = {1,10,3,3,3};
        int k = 3;
        System.out.println(maxKElement(arr, k));
    }

    public static long maxKElement(int[] arr, int k) {
        PriorityQueue<Long> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (long i : arr) pq.add(i);
        long ans = 0;
        while (k-- > 0) {
            double remove = pq.remove();
            ans += remove;
            remove = Math.ceil(remove / 3);
            pq.add((long) remove);
        }
        return ans;
    }
}
