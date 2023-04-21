package com.HeapPriorityQueue;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class KthSmallestPrimeFraction {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5};
        int k = 3;
        System.out.println(Arrays.toString(kthSmallestPrimeFraction(arr, k)));
    }

    public static int[] kthSmallestPrimeFraction(int[] arr, int k) {
        PriorityQueue<pair> pq = new PriorityQueue<pair>(Collections.reverseOrder());
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                pq.add(new pair(arr[i], arr[j], (double) arr[i] / (double) arr[j]));
                if (pq.size() > k) pq.remove();
            }
        }
        assert pq.peek() != null;
        return new int[]{pq.peek().eOne, pq.peek().eTwo};
    }

    public static class pair implements Comparable<pair> {
        int eOne;
        int eTwo;
        double fraction;

        pair(int eOne, int eTwo, double fraction) {
            this.eOne = eOne;
            this.eTwo = eTwo;
            this.fraction = fraction;
        }

        /**
         * @param o the object to be compared.
         * @return
         */
        @Override
        public int compareTo(pair o) {
            if (this.fraction > o.fraction) return 1;
            else return -1;
        }
    }
}
