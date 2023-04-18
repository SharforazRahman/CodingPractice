package com.HeapPriorityQueue;

import java.util.Collections;
import java.util.PriorityQueue;

//https://leetcode.com/problems/last-stone-weight/
public class LastStoneWeight {
    public static void main(String[] args) {
        int[] arr = {2,7,4,1,8,1};
        System.out.println(lastStoneWeight(arr));
    }

    public static int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int i : stones) pq.add(i);

        while (pq.size() > 1){
            int first = pq.remove();
            int second = pq.remove();
            pq.add(Math.abs(second-first));
        }
        return pq.remove();
    }
}