package com.Math;
//https://leetcode.com/problems/minimum-bit-flips-to-convert-number/description/?orderBy=most_votes
public class MinimumBitFlipToConvertNumber {
    public static void main(String[] args) {
        int start = 10, goal = 7;
        System.out.println(minBitFlips(start,goal));
    }

    public static int minBitFlips(int start, int goal) {
        return Integer.bitCount(start^goal);
    }
}
