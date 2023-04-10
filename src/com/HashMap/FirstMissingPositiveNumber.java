package com.HashMap;
//https://leetcode.com/problems/first-missing-positive/description/
import java.util.HashMap;

public class FirstMissingPositiveNumber {
    public static void main(String[] args) {
        int[] arr = {7, 8, 9, 11, 12};
        System.out.println(firstMissingPositive(arr));
    }

    public static int firstMissingPositive(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i : arr) map.put(i, -1);
        for (int i = 1; i <= arr.length; i++) {
            if (!map.containsKey(i)) return i;
        }
        return -1;
    }
}
