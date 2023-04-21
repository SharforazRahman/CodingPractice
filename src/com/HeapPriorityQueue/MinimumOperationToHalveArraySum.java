package com.HeapPriorityQueue;
//https://leetcode.com/problems/minimum-operations-to-halve-array-sum/description/
import java.util.Collections;
import java.util.PriorityQueue;

public class MinimumOperationToHalveArraySum {
    public static void main(String[] args) {
        int[] arr = {5, 19, 8, 1};
        System.out.println(halveArray(arr));
    }

    public static int halveArray(int[] arr) {
        PriorityQueue<Double> pq = new PriorityQueue<>(Collections.reverseOrder());
        double initialSum = 0, afterSum = 0;
        for (int i : arr) {
            initialSum += i;
            pq.add((double) i);
        }

        int count = 0;
        while (afterSum < initialSum / 2) {
            double store = pq.remove() / 2;
            afterSum += store;
            pq.add(store);
            count++;
        }
        return count;
    }
}
