package com.Sorting;
//https://leetcode.com/problems/maximum-number-of-coins-you-can-get/

import java.util.Arrays;

public class MinimumNumberOfCoinYouCanGet {
    public static void main(String[] args) {
        int[] piles = {9, 8, 7, 6, 5, 1, 2, 3, 4};
        System.out.println(maxCoins(piles));
    }

    public static int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int res = 0;

        for (int i = piles.length / 3; i < piles.length; i += 2) {
            res += piles[i];
        }
        return res;
    }
}
