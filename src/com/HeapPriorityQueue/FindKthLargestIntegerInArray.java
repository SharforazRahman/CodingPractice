package com.HeapPriorityQueue;
//https://leetcode.com/problems/find-the-kth-largest-integer-in-the-array/

import java.math.BigInteger;
import java.util.PriorityQueue;


public class FindKthLargestIntegerInArray {
    public static void main(String[] args) {
        String[] arr = {"0", "0", "0", "0", "10"};
        int k = 3;
        System.out.println(kthLargestNumber(arr, k));
    }

    public static String kthLargestNumber(String[] arr, int k) {
        PriorityQueue<BigInteger> pq = new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {
            if (i < k) {
                pq.add(new BigInteger(arr[i]));
            } else {
                BigInteger val = new BigInteger(arr[i]);
                if (val.compareTo(pq.peek()) > 0) {
                    pq.remove();
                    pq.add(val);
                }
            }
        }
        return pq.remove().toString();
    }
}
