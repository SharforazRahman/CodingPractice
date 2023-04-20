package com.HeapPriorityQueue;

import java.util.PriorityQueue;

public class MaximumProductsAfterKIncrement {
    public static void main(String[] args) {
        int[] arr = {24, 5, 64, 53, 26, 38};
        int k = 54;
        System.out.println(maximumProduct(arr, k));
    }

    public static int maximumProduct(int[] arr, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i : arr) pq.add(i);

        while (k-- > 0) {
            int ele = pq.remove();
            pq.add(ele + 1);
        }
        long sum = 1;
        while (!pq.isEmpty()) sum = sum * pq.remove() % 1000000007;
        return (int) sum;
    }
}
