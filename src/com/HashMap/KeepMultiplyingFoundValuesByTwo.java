package com.HashMap;

import java.util.HashMap;

//https://leetcode.com/problems/keep-multiplying-found-values-by-two/
public class KeepMultiplyingFoundValuesByTwo {
    public static void main(String[] args) {
        int[] arr = {2,7,9};
        int original = 4;
        System.out.println(findFinalValue(arr, original));
    }

    public static int findFinalValue(int[] a, int original) {
        HashMap<Integer, Integer> map = new HashMap<>();
        boolean found = false;

        for (int i : a) {
            if (i == original) {
                found = true;
                break;
            }
        }

        int check = original;
        if (found) {
            check = original * 2;
            for (int i : a) map.put(i, 0);
            for (int i : a) {
                if (!map.containsKey(check)) return check;
                else check *= 2;
            }
        }
        return check;
    }
}
