package com.String;

import java.util.Arrays;
//https://leetcode.com/problems/separate-the-digits-in-an-array/
public class separateTheDigitsInAnArray {
    public static void main(String[] args) {
        int[] arr = {13,25,83,77};
        System.out.println(Arrays.toString(separateDigits(arr)));
    }
    public static int[] separateDigits(int[] a) {
        StringBuilder sb = new StringBuilder();
        for(int i : a) sb.append(i);

        int[] res = new int[sb.toString().length()];
        int index = 0;
        for(int i : sb.toString().toCharArray()) res[index++] = Integer.parseInt(String.valueOf((char) i));
        return res;
    }
}
