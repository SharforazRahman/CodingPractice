package com.HashMap;

import java.util.Arrays;
import java.util.HashMap;

//https://leetcode.com/problems/next-greater-element-i/
public class NextGreaterElementOne {
    public static void main(String[] args) {
        int[] a = {3, 1, 5, 7, 9, 2, 6};
        int[] b = {1, 2, 3, 5, 6, 7, 9, 11};
        System.out.println(Arrays.toString(nextGreaterElement(a, b)));
    }

    public static int[] nextGreaterElement(int[] a, int[] b) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] res = new int[a.length];
        for (int j : a) {
            int idx = findElement(b, j);
            map.put(j, Max(b, idx));
        }

        for (int i = 0; i < a.length; i++) {
            res[i] = map.get(a[i]);
        }
        return res;
    }

    public static int Max(int[] arr, int start) {
        int max = arr[start];
        boolean iterate = false;
        for (int i = start; i < arr.length; i++) {
            if (arr[i] > max) {
                iterate = true;
                max = arr[i];
                break;
            }
        }
        return !iterate ? -1 : max;
    }

    public static int findElement(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) return i;
        }
        return -1;
    }
}
