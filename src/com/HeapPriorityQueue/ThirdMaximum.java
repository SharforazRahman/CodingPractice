package com.HeapPriorityQueue;
//https://leetcode.com/problems/third-maximum-number/description/
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class ThirdMaximum {
    public static void main(String[] args) {
        int[] arr = {2, 2, 3, 1};
        System.out.println(thirdMax(arr));
    }

    public static int thirdMax(int[] arr) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        Set<Integer> set = new HashSet<>();

        for (int i : arr) {
            if (!set.contains(i)) {
                set.add(i);
                pq.add(i);
                if (pq.size() > 3) {
                    pq.remove();
                }
            }
        }
        if (pq.size() == 2) {
            pq.poll();
        }
        return pq.remove();
    }
}

