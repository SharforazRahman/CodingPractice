package com.Sorting;
//https://leetcode.com/problems/can-make-arithmetic-progression-from-sequence/
import java.util.Arrays;

public class CanMakeArithmeticProgressionFromSequence {
    public static void main(String[] args) {
        int[] arr = {3, 5, 1};
        System.out.println(arithmeticProgression(arr));
    }

    public static boolean arithmeticProgression(int[] arr) {
        if (arr.length == 2) return true;
        Arrays.sort(arr);
        int store = Math.abs(arr[1] - arr[0]);
        for (int i = 1; i < arr.length - 1; i++) {
            if (Math.abs(arr[i + 1] - arr[i]) != store) return false;
        }
        return true;
    }
}
