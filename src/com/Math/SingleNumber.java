package com.Math;

public class SingleNumber {
    public static void main(String[] args) {
        int[] arr = {2, 1, 2, 5, 1};
        System.out.println(singleNumber(arr));
    }

    public static int singleNumber(int[] arr) {
        int xor = 0;
        for (int i : arr) {
            xor ^= i;
        }
        return xor;
    }
}
