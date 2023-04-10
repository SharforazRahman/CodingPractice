package com.HashMap;
//https://leetcode.com/problems/kth-missing-positive-number/description/
import java.util.HashMap;

public class KthMissingPositiveNumber {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 7, 11};
        int k = 5;
        System.out.println(findKthPositive(arr, k));
    }

    public static int findKthPositive(int[] a, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : a) map.put(i, i);
        int count = 0;
        for (int i = 1; i < Integer.MAX_VALUE; i++) {
            if (!map.containsKey(i)) {
                count++;
                if (count == k) return i;
            }
        }
        return -1;
    }
}
