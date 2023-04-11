package com.HashMap;
//https://leetcode.com/problems/most-frequent-even-element/description/
import java.util.HashMap;

public class MostFrequentEvenElement {
    public static void main(String[] args) {
        int[] a = {29, 47, 21, 41, 13, 37, 25, 7};
        System.out.println(mostFrequentEven(a));
    }

    public static int mostFrequentEven(int[] a) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : a) map.put(i, map.getOrDefault(i, 0) + 1);

        int max = -1, similar = -1;
        for (int i : map.keySet()) {
            if (i % 2 == 0) {
                if (map.get(i) > max) {
                    max = map.get(i);
                    similar = i;
                } else if (map.get(i) == max && similar > i) {
                    similar = i;
                }
            }
        }
        return similar;
    }
}
