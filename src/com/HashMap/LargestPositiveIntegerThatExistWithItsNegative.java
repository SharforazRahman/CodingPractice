package com.HashMap;
//https://leetcode.com/problems/largest-positive-integer-that-exists-with-its-negative/description/
import java.util.HashMap;

public class LargestPositiveIntegerThatExistWithItsNegative {
    public static void main(String[] args) {
        int[] arr = {-1, 2, -3, 3};
        System.out.println(findMaxK(arr));
    }

    public static int findMaxK(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = -1;
        for (int i : arr) {
            if (map.containsKey(i * -1)) {
                max = Math.max(max, Math.abs(i));
            }
            map.put(i, 0);
        }
        return max;
    }
}
