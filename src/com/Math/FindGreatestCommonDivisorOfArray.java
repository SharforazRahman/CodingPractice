package com.Math;
//https://leetcode.com/problems/find-greatest-common-divisor-of-array/
public class FindGreatestCommonDivisorOfArray {
    public static void main(String[] args) {
        int[] arr = {2, 5, 6, 9, 10};
        System.out.println(findGCD(arr));
    }

    public static int findGCD(int[] a) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, store = 0;

        for (int i : a) {
            max = Math.max(max, i);
            min = Math.min(min, i);
        }
        for (int i = 1; i <= max; i++) {
            if (min % i == 0 && max % i == 0) store = Math.max(i,store);;
        }
        return store;
    }
}
