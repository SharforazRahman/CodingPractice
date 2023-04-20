package com.HeapPriorityQueue;
//https://leetcode.com/problems/remove-stones-to-minimize-the-total/
import java.util.Collections;
import java.util.PriorityQueue;

public class RemoveStonesToMinimizeTheTotal {
    public static void main(String[] args) {
        int[] piles = {4, 3, 6, 7};
        int k = 3;
        System.out.println(minStoneSum(piles, k));
    }

    public static int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int removal, ans = 0;
        for (int i : piles) pq.add(i);

        while (k != 0) {
            removal = pq.remove();
            pq.add(removal - (removal / 2));
            k--;
        }
        while (!pq.isEmpty()) ans += pq.remove();
        return ans;
    }
}
