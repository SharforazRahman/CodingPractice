package com.BinarySearch;
//https://leetcode.com/problems/binary-search/
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 0, 3, 5, 9, 12};
        int target = 9;
        System.out.println(search(arr, target));
    }

    public static int search(int[] a, int target) {
        int start = 0;
        int end = a.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (a[mid] == target) return mid;
            else if (a[mid] > target) end = mid - 1;
            else start = mid + 1;
        }
        return -1;
    }
}
