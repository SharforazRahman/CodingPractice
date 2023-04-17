package com.TwoPointer;
//https://leetcode.com/problems/remove-duplicates-from-sorted-array/
public class RemoveDuplicateFromSortedArray {
    public static void main(String[] args) {
        int[] arr = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(removeDuplicate(arr));
    }

    public static int removeDuplicate(int[] arr) {
        int i = 0;
        int j = 1;

        while (j < arr.length) {
            if (arr[i] == arr[j]) {
                j++;
            } else {
                i++;
                arr[i] = arr[j];
            }
        }
        return i + 1;
    }
}
