package com.SlidingWindow;
//https://leetcode.com/problems/minimum-consecutive-cards-to-pick-up/
import java.util.HashMap;

public class MinimumConsecutiveCardsToPickUp {
    public static void main(String[] args) {
        int[] arr = {3, 4, 2, 3, 4, 7};
        System.out.println(minimumCardPickup(arr));
    }

    public static int minimumCardPickup(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                min = Math.min(min, (i - map.get(arr[i]) + 1));
            }
            map.put(arr[i], i);
        }
        return min == Integer.MAX_VALUE ? -1 : min;
    }
}
