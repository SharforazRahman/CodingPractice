package com.Array;
//https://leetcode.com/problems/arithmetic-subarrays/description/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArithmeticSubArray {
    public static void main(String[] args) {
        int[] arr = {4, 6, 5, 9, 3, 7};
        int[] l = {0, 0, 2};
        int[] r = {2, 3, 5};
        System.out.println(checkArithmeticSubArrays(arr, l, r));
    }

    public static List<Boolean> checkArithmeticSubArrays(int[] arr, int[] l, int[] r) {
        ArrayList<Boolean> list = new ArrayList<>();
        int left = 0, right = 0;
        while (left != l.length) {
            list.add(check(arr, l[left++], r[right++]));
        }
        return list;
    }

    public static boolean check(int[] arr, int start, int end) {
        int[] copyArr = Arrays.copyOfRange(arr, start, end + 1);
        Arrays.sort(copyArr);

        int similarity = copyArr[1] - copyArr[0];
        int i = 0, j = 1;
        while (j != copyArr.length) {
            if (copyArr[j] - copyArr[i] != similarity) return false;
            i++;
            j++;
        }
        return true;
    }
}

