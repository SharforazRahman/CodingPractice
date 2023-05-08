package com.Array;

import java.util.Arrays;

//https://leetcode.com/problems/plus-one/
public class plusOne {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println(Arrays.toString(plusOneCode(arr)));
    }

    public static int[] plusOneCode(int[] digits) {
        for(int i = digits.length - 1; i >= 0; i--){
            if(digits[i] < 9){
                digits[i] ++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] res = new int[digits.length + 1];
        res[0] = 1;
        return res;
    }
}