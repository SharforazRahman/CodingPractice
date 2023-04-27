package com.Array;
//https://leetcode.com/problems/number-of-distinct-averages/
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class NumberOfDistinctAverage {
    public static void main(String[] args) {
        int[] arr = {4, 1, 4, 0, 3, 5};
        System.out.println(distinctAverages(arr));
    }

    public static int distinctAverages(int[] nums) {
        Set<Double> set = new HashSet<>();
        Arrays.sort(nums);
        for (int i = 0, j = nums.length - 1; i < nums.length / 2; i++, j--) {
            double d = Double.parseDouble(String.valueOf(nums[i] + nums[j])) / 2;
            set.add(d);
        }
        return set.size();
    }
}
