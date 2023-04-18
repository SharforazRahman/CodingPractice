package com.Sorting;
//https://leetcode.com/problems/maximum-product-difference-between-two-pairs/
import java.util.Arrays;

public class MaximumProductDifferenceBetweenTwoPairs {
    public static void main(String[] args) {
        int[] arr = {5,6,2,7,4};
        System.out.println(maxProductDifference(arr));
    }
    public static int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int max = nums[nums.length - 1] * nums[nums.length - 2];
        int min = nums[0] * nums[1];
        return max - min;
    }
}
