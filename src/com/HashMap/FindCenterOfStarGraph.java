package com.HashMap;

import java.util.HashMap;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//https://leetcode.com/problems/find-center-of-star-graph/
public class FindCenterOfStarGraph {
    public static void main(String[] args) {
        int[][] arr = {
                {3, 1, 2, 5},
                {1, 2, 3},
                {3, 5, 6}
        };
        System.out.println(findCenter(arr));
    }
    public static int findCenter(int[][] array) {
        int[] a = Stream.of(array).flatMapToInt(IntStream::of).toArray();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : a) map.put(i, map.getOrDefault(i, 0) + 1);
        for (int i : map.keySet()) if (map.get(i) > 1) return i;
        return 0;
    }
}
