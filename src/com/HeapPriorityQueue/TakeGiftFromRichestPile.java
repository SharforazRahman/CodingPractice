package com.HeapPriorityQueue;
//https://leetcode.com/problems/take-gifts-from-the-richest-pile/description/
import java.util.Collections;
import java.util.PriorityQueue;

public class TakeGiftFromRichestPile {
    public static void main(String[] args) {
        int[] gifts = {25, 64, 9, 4, 100};
        int k = 4;
        System.out.println(pickGifts(gifts, k));
    }

    public static long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int sqrt = 1;
        long ans = 0;

        for (int i : gifts) pq.add(i);
        while (k != 0) {
            sqrt = (int) Math.sqrt(pq.remove());
            pq.add(sqrt);
            k--;
        }
        while (!pq.isEmpty()) ans += pq.remove();
        return ans;
    }
}
