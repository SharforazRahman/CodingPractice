package com.Array;
//https://leetcode.com/problems/three-consecutive-odds/description/
public class threeConsecutiveOdds {
    public static void main(String[] args) {
        int[] arr = {1,2,34,3,4,5,7,23,12};
        System.out.println(threeConsecutive(arr));
    }

    public static boolean threeConsecutive(int[] arr) {
        int count = 0;
        for (int j : arr) {
            if (j % 2 != 0) count++;
            if (count == 3) return true;
            if (j % 2 == 0) count = 0;
        }
        return false;
    }
}
