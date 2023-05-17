package com.Array;
//https://leetcode.com/problems/build-array-from-permutation/
import java.util.Arrays;

public class BuildArrayFromPermutation {
    public static void main(String[] args) {
        int[] arr = {0,2,1,5,3,4};
        System.out.println(Arrays.toString(buildArray(arr)));
    }
    public static int[] buildArray(int[] arr){
        int[] ans = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            ans[i] = arr[arr[i]];
        }
        return ans;
    }
}
