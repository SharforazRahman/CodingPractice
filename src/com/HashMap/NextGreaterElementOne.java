package com.HashMap;

import java.util.Arrays;
import java.util.HashMap;

//https://leetcode.com/problems/next-greater-element-i/
public class NextGreaterElementOne {
    public static void main(String[] args) {
        int[] a = {4, 1, 2};
        int[] b = {1, 3, 4, 2};
        System.out.println(Arrays.toString(nextGreaterElement(a, b)));
    }

    public static int[] nextGreaterElement(int[] a, int[] b) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            map.putIfAbsent(a[i], findMax(b, i, b.length - 1));
        }
        System.out.println(map);
        return b;
    }

    public static int findMax(int[] arr, int start, int end) {
        int max = -1;
        for (int i = start + 1; i <= end; i++) {
            if(arr[i] > max){
                max = arr[i];
                break;
            }
        }
        return max;
    }
}

